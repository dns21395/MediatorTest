package com.example.gabyshevdagger.mediators

import com.example.core.di.SingleComponentHolder
import com.example.screen_one_api.ScreenOne
import com.example.screen_one_api.ScreenOneApi
import com.example.feature.screenone.di.ScreenOneComponent
import com.example.gabyshevdagger.MediatorManager

class ScreenOneMediator(mediatorManager: MediatorManager) {
    private val componentHolder = SingleComponentHolder<Unit, ScreenOneComponent> {
        ScreenOneComponent.getNewInstance()
    }

    private fun provideComponent(): ScreenOneComponent {
        return componentHolder.component ?: componentHolder.initAndGet {
            Unit
        }
    }

    val apiStub = object : ScreenOneApi {
        override fun provideScreenOne(): ScreenOne {
            return provideComponent().provideScreenOne()
        }
    }
}