package com.example.gabyshevdagger

import com.example.core.di.SingleComponentHolder
import com.example.corenavigation.bindings.CoreNavigationApi
import com.example.gabyshevdagger.di.MainComponent
import com.example.gabyshevdagger.di.MainDeps
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

class MainMediator(private val mediatorManager: MediatorManager) {
    private val componentHolder = SingleComponentHolder<MainDeps, MainComponent> {
        MainComponent.getNewInstance(it)
    }

    private fun provideComponent(): MainComponent {
        return componentHolder.component ?: componentHolder.initAndGet {
            object : MainDeps {
                override fun router(): Router {
                    return mediatorManager.coreNavigationMediator.apiStub.router()
                }

                override fun navigatorHolder(): NavigatorHolder {
                    return mediatorManager.coreNavigationMediator.apiStub.navigatorHolder()
                }
            }
        }
    }

    val apiStub = object : MainDeps {
        override fun router(): Router {
            return provideComponent().router()
        }

        override fun navigatorHolder(): NavigatorHolder {
            return provideComponent().navigatorHolder()
        }
    }
}