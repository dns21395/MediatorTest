package com.example.feature.screenone.di

import com.example.core.di.PerFeature
import com.example.feature.screenone.ScreenOneImpl
import com.example.screen_one_api.ScreenOne
import dagger.Module
import dagger.Provides

@Module
class ScreenOneModule {
    @Provides
    @PerFeature
    fun provideScreenOne(): ScreenOne = ScreenOneImpl()
}