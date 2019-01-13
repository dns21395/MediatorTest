package com.example.gabyshevdagger.di

import com.example.gabyshevdagger.App
import com.example.gabyshevdagger.MainActivity
import com.example.gabyshevdagger.MainFragment
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [MainModule::class]
)
@Singleton
abstract class MainComponent {
    companion object {
        lateinit var mainComponent: MainComponent

        @JvmStatic
        fun getNewInstance(): MainComponent {
            mainComponent = DaggerMainComponent.builder().build()
            return mainComponent
        }
    }

    abstract fun inject(app: App)
    abstract fun inject(mainActivity: MainActivity)
    abstract fun inject(mainFragment: MainFragment)
}