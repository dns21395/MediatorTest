package com.example.feature.screenone.di

import com.example.core.di.PerFeature
import com.example.feature.screenone.ScreenOne
import com.example.feature.screenone.ScreenOneImpl
import dagger.Module
import dagger.Provides

@Module
class ScreenOneModule {
    @Provides
    @PerFeature
    fun provideScreenOne(): ScreenOne = ScreenOneImpl()

}