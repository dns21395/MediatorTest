package com.example.featurescreenfourimpl.di

import com.example.core.di.PerFeature
import com.example.featurescreenfourapi.FeatureFourApi
import com.example.featurescreenfourimpl.FragmentFourImpl
import dagger.Component

@Component(modules = [FragmentFourModule::class])
@PerFeature
abstract class FragmentFourComponent : FeatureFourApi {
    companion object {


        fun getInstance(): FragmentFourComponent {
            return DaggerFragmentFourComponent.builder().build()
        }
    }

    abstract fun inject(fragmentFour: FragmentFourImpl)
}