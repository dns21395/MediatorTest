package com.example.featurescreenfourimpl.di

import com.example.core.di.PerFeature
import com.example.featurescreenfourapi.FragmentFour
import com.example.featurescreenfourimpl.FragmentFourImpl
import dagger.Module
import dagger.Provides

@Module
class FragmentFourModule {
    @Provides
    @PerFeature
    fun fragmentFour(): FragmentFour = FragmentFourImpl()
}
