package com.example.gabyshevdagger

import android.app.Application
import com.example.gabyshevdagger.di.MainComponent

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        initDI()
    }

    private fun initDI() {
        MainComponent.getNewInstance().inject(this)
    }
}