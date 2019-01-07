package com.example.feature.screentwo.di

import com.example.core.di.PerFeature
import com.example.feature.screentwo.bindings.ScreenTwoApi
import com.example.feature.screentwo.bindings.ScreenTwoDeps
import dagger.Component

@Component(modules = [ScreenTwoModule::class],
    dependencies = [ScreenTwoDeps::class])
@PerFeature
abstract class ScreenTwoComponent : ScreenTwoApi {
    companion object {
        @JvmStatic
        fun getNewInstance(deps: ScreenTwoDeps): ScreenTwoComponent {
            return DaggerScreenTwoComponent
                .builder()
                .screenTwoDeps(deps)
                .build()
        }
    }
}