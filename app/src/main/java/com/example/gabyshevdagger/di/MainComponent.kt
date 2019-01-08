package com.example.gabyshevdagger.di

import com.example.gabyshevdagger.App
import com.example.gabyshevdagger.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [MainModule::class],
    dependencies = [MainDeps::class]
)
@Singleton
abstract class MainComponent : MainDeps {
    companion object {
        lateinit var mainComponent: MainComponent

        @JvmStatic
        fun getNewInstance(deps: MainDeps): MainComponent {
            mainComponent = DaggerMainComponent.builder().mainDeps(deps).build()
            return mainComponent
        }
    }

    abstract fun inject(app: App)
    abstract fun inject(mainActivity: MainActivity)
}