package com.example.feature.screentwo.di

import com.example.core.di.PerFeature
import com.example.feature.screentwo.MyFragment
import com.example.feature.screentwo.ScreenTwoImpl
import com.example.feature.screentwo.bindings.ScreenTwoApi
import com.example.feature.screentwo.bindings.ScreenTwoDeps
import dagger.Component

@Component(
    modules = [ScreenTwoModule::class],
    dependencies = [ScreenTwoDeps::class]
)
@PerFeature
abstract class ScreenTwoComponent : ScreenTwoApi {
    companion object {
        lateinit var screenTwoComponent: ScreenTwoComponent

        fun getNewInstance(deps: ScreenTwoDeps): ScreenTwoComponent {
            screenTwoComponent = DaggerScreenTwoComponent
                .builder()
                .screenTwoDeps(deps)
                .build()
            return screenTwoComponent
        }
    }

    abstract fun inject(screenTwoImpl: ScreenTwoImpl)
    abstract fun inject(myFragment: MyFragment)
}