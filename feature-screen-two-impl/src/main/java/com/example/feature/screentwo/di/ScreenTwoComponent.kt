package com.example.feature.screentwo.di

import com.example.core.di.PerFeature
import com.example.feature.screentwo.MyFragment
import com.example.feature.screentwo.ScreenTwoImpl
import com.example.featurescreentwoapi.ScreenTwoApi
import dagger.Component

@Component(
    modules = [ScreenTwoModule::class],
    dependencies = [ScreenTwoDependencies::class]
)
@PerFeature
abstract class ScreenTwoComponent : ScreenTwoApi {
    companion object {
        lateinit var screenTwoComponent: ScreenTwoComponent

        fun getNewInstance(dependencies: ScreenTwoDependencies): ScreenTwoComponent {
            screenTwoComponent = DaggerScreenTwoComponent
                .builder()
                .screenTwoDependencies(dependencies)
                .build()
            return screenTwoComponent
        }
    }

    abstract fun inject(screenTwoImpl: ScreenTwoImpl)
    abstract fun inject(myFragment: MyFragment)
}