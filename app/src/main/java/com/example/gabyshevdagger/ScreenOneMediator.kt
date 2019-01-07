package com.example.gabyshevdagger

import com.example.core.di.SingleComponentHolder
import com.example.feature.screenone.ScreenOne
import com.example.feature.screenone.bindings.ScreenOneApi
import com.example.feature.screenone.di.ScreenOneComponent

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