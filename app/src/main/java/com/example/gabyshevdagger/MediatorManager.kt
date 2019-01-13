package com.example.gabyshevdagger

import com.example.gabyshevdagger.mediators.*

class MediatorManager {
    val featureListMediator by lazy { FeatureListMediator(this) }

    val featureScreenOneMediator by lazy { ScreenOneMediator(this) }

    val featureScreenTwoMediator by lazy { ScreenTwoMediator(this) }

    val coreNavigationMediator by lazy { CoreNavigationMediator(this) }

    val featureScreenFourMediator by lazy { ScreenFourMediator(this) }

    val featureScreenFiveMediator by lazy { ScreenFiveMediator(this) }

    val mainMediator by lazy { MainMediator(this) }
}