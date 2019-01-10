package com.example.feature.screentwo

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.coreutils.flow.SupportAppScreen
import com.example.coreutils.global.BaseFragment
import com.example.coreutils.global.FlowFragment
import com.example.screen_one_api.ScreenOne
import com.example.feature.screentwo.di.ScreenTwoComponent
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class ScreenTwoImpl : FlowFragment(), ScreenTwo {

    @Inject
    lateinit var thefragment: com.example.screen_one_api.ScreenOne

    @Inject
    lateinit var router: Router

    override fun onCreate(savedInstanceState: Bundle?) {
        ScreenTwoComponent.screenTwoComponent.inject(this)
        super.onCreate(savedInstanceState)

        val myfragment = object : SupportAppScreen() {
            override fun getFragment(): BaseFragment {
                return thefragment as BaseFragment
            }
        }

        fragmentManager?.beginTransaction()!!
            .replace(R.id.container, thefragment as Fragment)
            .commit()

//        router.replaceScreen(myfragment)

//        if (childFragmentManager.fragments.isEmpty()) {
//            navigator.setLaunchScreen(Screens.MyFragment)
//        }
    }
}