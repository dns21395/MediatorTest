package com.example.gabyshevdagger

import androidx.fragment.app.Fragment
import com.example.coreutils.flow.SupportAppScreen


class Screens(private val mediatorManager: MediatorManager) {
    inner class Main : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return MainFragment()
        }
    }

    inner class TwoFlow : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return mediatorManager
                .featureScreenTwoMediator
                .apiStub
                .provideScreenTwo() as Fragment
        }
    }

    inner class FiveFlow : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return mediatorManager
                .featureScreenFiveMediator
                .apiStub
                .fragmentFive() as Fragment
        }
    }
}