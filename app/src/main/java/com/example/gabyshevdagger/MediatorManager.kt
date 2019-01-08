package com.example.gabyshevdagger

class MediatorManager {
    val featureListMediator by lazy { FeatureListMediator(this) }

    val featureScreenOneMediator by lazy { ScreenOneMediator(this) }

    val featureScreenTwoMediator by lazy { ScreenTwoMediator(this) }

    val coreNavigationMediator by lazy { CoreNavigationMediator(this) }

    val mainMediator by lazy { MainMediator(this) }
}