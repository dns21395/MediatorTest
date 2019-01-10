package com.example.feature.screentwo.di

import com.example.core.di.PerFeature
import com.example.coreutils.flow.FlowRouter
import com.example.featurescreentwoapi.ScreenTwo
import com.example.feature.screentwo.ScreenTwoImpl
import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

@Module
class ScreenTwoModule {
    @Provides
    @PerFeature
    fun screenTwo(): ScreenTwo = ScreenTwoImpl()

    @Provides
    @PerFeature
    fun proviceCicerone(globalRouter: Router): Cicerone<FlowRouter> = Cicerone.create(FlowRouter(globalRouter))

    @Provides
    @PerFeature
    fun provideFlowRouter(cicerone: Cicerone<FlowRouter>): FlowRouter = cicerone.router

    @Provides
    @PerFeature
    fun provideNavigatorHolder(cicerone: Cicerone<FlowRouter>): NavigatorHolder = cicerone.navigatorHolder
}