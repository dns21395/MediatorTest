package com.example.corenavigation.di

import com.example.corenavigation.bindings.CoreNavigationApi
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [CoreNavigationModule::class]
)
@Singleton
abstract class CoreNavigationComponent : CoreNavigationApi {
    companion object {

        @JvmStatic
        fun getNewInstance(): CoreNavigationComponent {
            return DaggerCoreNavigationComponent.builder().build()
        }
    }
}