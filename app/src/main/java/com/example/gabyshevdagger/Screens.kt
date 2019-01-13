package com.example.gabyshevdagger

import androidx.fragment.app.Fragment
import com.example.coreutils.flow.SupportAppScreen


object Screens {
    object Main : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return MainFragment()
        }
    }

    object TwoFlow : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return MediatorManager()
                .featureScreenTwoMediator
                .apiStub
                .provideScreenTwo() as Fragment
        }
    }

    object FiveFlow : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return MediatorManager()
                .featureScreenFiveMediator
                .apiStub
                .fragmentFive() as Fragment
        }
    }
}