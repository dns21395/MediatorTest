package com.example.gabyshevdagger.mediators

import com.example.core.di.SingleComponentHolder
import com.example.screen_one_api.ScreenOne
import com.example.feature.screentwo.di.ScreenTwoDependencies
import com.example.feature.screentwo.di.ScreenTwoComponent
import com.example.featurescreentwoapi.ScreenTwo
import com.example.featurescreentwoapi.ScreenTwoApi
import com.example.gabyshevdagger.MediatorManager
import ru.terrakok.cicerone.Router

class ScreenTwoMediator(private val mediatorManager: MediatorManager) {
    private val componentHolder = SingleComponentHolder<ScreenTwoDependencies, ScreenTwoComponent> {
        ScreenTwoComponent.getNewInstance(it)
    }

    private fun provideComponent(): ScreenTwoComponent {
        return componentHolder.component ?: componentHolder.initAndGet {
            object : ScreenTwoDependencies {
                override fun getScreenOne(): ScreenOne {
                    return mediatorManager.featureScreenOneMediator.apiStub.provideScreenOne()
                }

                override fun getRouter(): Router {
                    return mediatorManager.coreNavigationMediator.apiStub.router()
                }
            }
        }
    }

    val apiStub = object : ScreenTwoApi {
        override fun provideScreenTwo(): ScreenTwo {
            return provideComponent().provideScreenTwo()
        }
    }
}