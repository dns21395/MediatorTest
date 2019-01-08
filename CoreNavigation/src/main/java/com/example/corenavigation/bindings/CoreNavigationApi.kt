package com.example.corenavigation.bindings

import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

interface CoreNavigationApi {
    fun router(): Router
    fun navigatorHolder(): NavigatorHolder
}