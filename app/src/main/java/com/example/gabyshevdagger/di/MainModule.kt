package com.example.gabyshevdagger.di

import com.example.gabyshevdagger.MediatorManager
import com.example.gabyshevdagger.Screens
import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import javax.inject.Singleton

@Module
class MainModule {
    @Singleton
    @Provides
    fun mediatorManager(): MediatorManager = MediatorManager()

    @Singleton
    @Provides
    fun screens(mediatorManager: MediatorManager): Screens = Screens(mediatorManager)

    @Singleton
    @Provides
    fun provideRouter(mediatorManager: MediatorManager): Router =
        mediatorManager.coreNavigationMediator.apiStub.router()

    @Singleton
    @Provides
    fun provideNavigatorHolder(mediatorManager: MediatorManager): NavigatorHolder =
        mediatorManager.coreNavigationMediator.apiStub.navigatorHolder()
}