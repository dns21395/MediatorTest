package com.example.feature.screentwo.bindings

import com.example.screen_one_api.ScreenOne
import ru.terrakok.cicerone.Router

interface ScreenTwoDeps {
    fun getScreenOne(): ScreenOne

    fun getRouter(): Router
}