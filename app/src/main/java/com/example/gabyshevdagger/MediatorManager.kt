package com.example.gabyshevdagger

class MediatorManager {
    val featureListMediator by lazy { FeatureListMediator(this) }
}