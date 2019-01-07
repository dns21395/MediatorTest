package com.example.feature.screentwo.di

import com.example.core.di.PerFeature
import com.example.feature.screentwo.ScreenTwo
import com.example.feature.screentwo.ScreenTwoImpl
import dagger.Module
import dagger.Provides

@Module
class ScreenTwoModule {
    @Provides
    @PerFeature
    fun screenTwo(): ScreenTwo = ScreenTwoImpl()
}