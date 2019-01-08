package com.example.gabyshevdagger

import androidx.fragment.app.Fragment
import com.example.coreutils.flow.SupportAppScreen


object Screens {
    object TwoFlow : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return MediatorManager()
                .featureScreenTwoMediator
                .apiStub
                .provideScreenTwo() as Fragment
        }
    }
}