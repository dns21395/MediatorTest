package com.example.featurescreenfiveimpl

import com.example.featurescreenfourapi.FragmentFour
import ru.terrakok.cicerone.Router

interface FragmentFiveDependencies {
    fun fragmentFour(): FragmentFour

    fun router(): Router
}