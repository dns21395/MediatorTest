package com.example.featurescreenfiveimpl.di

import com.example.core.di.PerFeature
import com.example.coreutils.flow.FlowRouter
import com.example.featurescreenfiveapi.FragmentFive
import com.example.featurescreenfiveimpl.FragmentFiveFlowImpl
import com.example.featurescreenfiveimpl.Screens
import com.example.featurescreenfourapi.FragmentFour
import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

@Module
class FragmentFiveModule {
    @Provides
    @PerFeature
    fun provideFragmentFive(): FragmentFive = FragmentFiveFlowImpl()

    @Provides
    @PerFeature
    fun provideCicerone(globalRouter: Router): Cicerone<FlowRouter> = Cicerone.create(FlowRouter(globalRouter))

    @Provides
    @PerFeature
    fun provideFlowRouter(cicerone: Cicerone<FlowRouter>): FlowRouter = cicerone.router

    @Provides
    @PerFeature
    fun provideNavigatorHolder(cicerone: Cicerone<FlowRouter>): NavigatorHolder = cicerone.navigatorHolder

    @Provides
    @PerFeature
    fun provideScreens(fragmentFour: FragmentFour): Screens = Screens(
        fragmentFour
    )
}