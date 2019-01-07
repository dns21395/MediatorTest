package com.example.feature.screenone.di

import com.example.core.di.PerFeature
import com.example.feature.screenone.bindings.ScreenOneApi
import dagger.Component

@Component(modules = [ScreenOneModule::class])
@PerFeature
abstract class ScreenOneComponent : ScreenOneApi {
    companion object {
        @JvmStatic
        fun getNewInstance(): ScreenOneComponent =
                DaggerScreenOneComponent.builder().build()
    }
}