package com.example.feature.screenone.di

import com.example.core.di.PerFeature
import com.example.feature.screenone.ScreenOneImpl
import com.example.screen_one_api.ScreenOneApi
import dagger.Component

@Component(modules = [ScreenOneModule::class])
@PerFeature
abstract class ScreenOneComponent : ScreenOneApi {

    companion object {
        fun getNewInstance(): ScreenOneComponent = DaggerScreenOneComponent.builder().build()
    }

    abstract fun inject(screenOneImpl: ScreenOneImpl)
}