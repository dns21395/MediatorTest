package com.example.gabyshevdagger

import com.example.core.di.SingleComponentHolder
import com.example.feature.screenone.ScreenOne
import com.example.feature.screentwo.ScreenTwo
import com.example.feature.screentwo.bindings.ScreenTwoApi
import com.example.feature.screentwo.bindings.ScreenTwoDeps
import com.example.feature.screentwo.di.ScreenTwoComponent

class ScreenTwoMediator(private val mediatorManager: MediatorManager) {
    private val componentHolder = SingleComponentHolder<ScreenTwoDeps, ScreenTwoComponent> {
        ScreenTwoComponent.getNewInstance(it)
    }

    private fun provideComponent(): ScreenTwoComponent {
        return componentHolder.component ?: componentHolder.initAndGet {
            object : ScreenTwoDeps {
                override fun getScreenOne(): ScreenOne {
                    return mediatorManager.featureScreenOneMediator.apiStub.provideScreenOne()
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