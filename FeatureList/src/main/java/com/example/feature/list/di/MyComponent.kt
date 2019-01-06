package com.example.feature.list.di

import com.example.core.di.PerFeature
import com.example.feature.list.bindings.FeatureListApi
import dagger.Component

@Component(modules = [MyModule::class])
@PerFeature
abstract class MyComponent : FeatureListApi {
    companion object {
        @JvmStatic
        fun getNewInstance(): MyComponent = DaggerMyComponent.builder().build()
    }
}