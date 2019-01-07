package com.example.gabyshevdagger

class MediatorManager {
    val featureListMediator by lazy { FeatureListMediator(this) }

    val featureScreenOneMediator by lazy { ScreenOneMediator(this) }

    val featureScreenTwoMediator by lazy { ScreenTwoMediator(this) }
}