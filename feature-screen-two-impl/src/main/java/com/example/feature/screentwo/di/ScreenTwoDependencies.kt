package com.example.feature.screentwo.di

import com.example.screen_one_api.ScreenOne
import ru.terrakok.cicerone.Router

interface ScreenTwoDependencies {
    fun getScreenOne(): ScreenOne

    fun getRouter(): Router
}