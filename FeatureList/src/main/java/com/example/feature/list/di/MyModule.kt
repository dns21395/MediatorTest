package com.example.feature.list.di

import com.example.core.di.PerFeature
import com.example.feature.list.SomeShit
import com.example.feature.list.SomeShitImpl
import dagger.Module
import dagger.Provides

@Module
class MyModule {
    @Provides
    @PerFeature
    fun provideSomeShit(): SomeShit = SomeShitImpl()
}