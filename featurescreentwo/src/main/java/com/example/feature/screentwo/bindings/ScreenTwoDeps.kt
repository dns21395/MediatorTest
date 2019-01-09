package com.example.feature.screentwo.bindings

import com.example.feature.screenone.ScreenOne
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

interface ScreenTwoDeps {
    fun getScreenOne(): ScreenOne

    fun getRouter(): Router

    fun getNavigatorHolder(): NavigatorHolder
}