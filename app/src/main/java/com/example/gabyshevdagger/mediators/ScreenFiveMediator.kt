package com.example.gabyshevdagger.mediators

import com.example.core.di.SingleComponentHolder
import com.example.featurescreenfiveapi.FeatureFiveApi
import com.example.featurescreenfiveapi.FragmentFive
import com.example.featurescreenfiveimpl.FragmentFiveDependencies
import com.example.featurescreenfiveimpl.di.FragmentFiveComponent
import com.example.featurescreenfourapi.FragmentFour
import com.example.gabyshevdagger.MediatorManager
import ru.terrakok.cicerone.Router

class ScreenFiveMediator(private val mediatorManager: MediatorManager) {
    private val componentHolder = SingleComponentHolder<FragmentFiveDependencies, FragmentFiveComponent> {
        FragmentFiveComponent.getNewInstance(it)
    }

    private fun provideComponent(): FragmentFiveComponent {
        return componentHolder.component ?: componentHolder.initAndGet {
            object : FragmentFiveDependencies {
                override fun fragmentFour(): FragmentFour {
                    return mediatorManager.featureScreenFourMediator.apiStub.fragmentFour()
                }

                override fun router(): Router {
                    return mediatorManager.coreNavigationMediator.apiStub.router()
                }
            }
        }
    }

    val apiStub = object : FeatureFiveApi {
        override fun fragmentFive(): FragmentFive {
            return provideComponent().fragmentFive()
        }
    }
}