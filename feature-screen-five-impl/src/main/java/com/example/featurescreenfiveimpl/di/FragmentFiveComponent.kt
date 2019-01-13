package com.example.featurescreenfiveimpl.di

import com.example.core.di.PerFeature
import com.example.featurescreenfiveapi.FeatureFiveApi
import com.example.featurescreenfiveimpl.FragmentFive
import com.example.featurescreenfiveimpl.FragmentFiveDependencies
import com.example.featurescreenfiveimpl.FragmentFiveFlowImpl
import dagger.Component

@Component(
    modules = [FragmentFiveModule::class],
    dependencies = [FragmentFiveDependencies::class]
)
@PerFeature
abstract class FragmentFiveComponent : FeatureFiveApi {
    companion object {
        lateinit var component: FragmentFiveComponent

        fun getNewInstance(deps: FragmentFiveDependencies): FragmentFiveComponent {
            component = DaggerFragmentFiveComponent
                .builder()
                .fragmentFiveDependencies(deps)
                .build()

            return component
        }
    }

    abstract fun inject(fragmentFiveFlow: FragmentFiveFlowImpl)
    abstract fun inject(fragmentFive: FragmentFive)
}