package com.example.gabyshevdagger.mediators

import com.example.core.di.SingleComponentHolder
import com.example.feature.list.SomeShit
import com.example.feature.list.bindings.FeatureListApi
import com.example.feature.list.di.MyComponent
import com.example.gabyshevdagger.MediatorManager

class FeatureListMediator(mediatorManager: MediatorManager) {
    private val componentHolder = SingleComponentHolder<Unit, MyComponent> {
        MyComponent.getNewInstance()
    }

    private fun provideComponent(): MyComponent {
        return componentHolder.component ?: componentHolder.initAndGet {
            Unit
        }
    }

    val apiStub = object : FeatureListApi {
        override fun someShit(): SomeShit {
            return provideComponent().someShit()
        }
    }
}