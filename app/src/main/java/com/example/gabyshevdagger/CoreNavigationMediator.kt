package com.example.gabyshevdagger

import com.example.core.di.SingleComponentHolder
import com.example.corenavigation.bindings.CoreNavigationApi
import com.example.corenavigation.di.CoreNavigationComponent
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

class CoreNavigationMediator(mediatorManager: MediatorManager) {
    private val componentHolder = SingleComponentHolder<Unit, CoreNavigationComponent> {
        CoreNavigationComponent.getNewInstance()
    }

    private fun provideComponent(): CoreNavigationComponent {
        return componentHolder.component ?: componentHolder.initAndGet {
            Unit
        }
    }

    val apiStub = object : CoreNavigationApi {
        override fun router(): Router {
            return provideComponent().router()
        }

        override fun navigatorHolder(): NavigatorHolder {
            return provideComponent().navigatorHolder()
        }
    }
}