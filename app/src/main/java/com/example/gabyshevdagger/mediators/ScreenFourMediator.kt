package com.example.gabyshevdagger.mediators

import com.example.core.di.SingleComponentHolder
import com.example.featurescreenfourapi.FeatureFourApi
import com.example.featurescreenfourapi.FragmentFour
import com.example.featurescreenfourimpl.di.FragmentFourComponent
import com.example.gabyshevdagger.MediatorManager

class ScreenFourMediator(mediatorManager: MediatorManager) {
    private val componentHolder = SingleComponentHolder<Unit, FragmentFourComponent> {
        FragmentFourComponent.getInstance()
    }

    private fun provideComponent(): FragmentFourComponent {
        return componentHolder.component ?: componentHolder.initAndGet {
            Unit
        }
    }

    val apiStub = object : FeatureFourApi {
        override fun fragmentFour(): FragmentFour {
            return provideComponent().fragmentFour()
        }
    }
}