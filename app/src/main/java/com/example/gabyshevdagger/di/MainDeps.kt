package com.example.gabyshevdagger.di

import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router

interface MainDeps {
    fun router(): Router
    fun navigatorHolder(): NavigatorHolder
}