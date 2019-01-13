package com.example.featurescreenfiveimpl

import androidx.fragment.app.Fragment
import com.example.coreutils.flow.SupportAppScreen
import javax.inject.Inject

class Screens @Inject constructor(
    private val fragmentFour: com.example.featurescreenfourapi.FragmentFour
) {
    inner class FragmentFive : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return com.example.featurescreenfiveimpl.FragmentFive()
        }
    }

    inner class FragmentFour : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return fragmentFour as Fragment
        }
    }
}