package com.example.feature.screentwo

import androidx.fragment.app.Fragment
import com.example.coreutils.flow.SupportAppScreen

object Screens {


    object MyFragment : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return com.example.feature.screentwo.MyFragment()
        }
    }

    object ScreenOne : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return super.getFragment()
        }
    }
}