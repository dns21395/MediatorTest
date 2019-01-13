package com.example.featurescreenfiveimpl

import android.os.Bundle
import com.example.coreutils.global.FlowFragment
import com.example.coreutils.setLaunchScreen
import com.example.featurescreenfiveapi.FragmentFive
import com.example.featurescreenfiveimpl.di.FragmentFiveComponent
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class FragmentFiveFlowImpl @Inject constructor() : FlowFragment(), FragmentFive {

    @Inject
    lateinit var router: Router

    @Inject
    lateinit var screens: Screens

    override val layoutRes: Int = R.layout.layout_container

    override fun onCreate(savedInstanceState: Bundle?) {
        FragmentFiveComponent.component.inject(this)
        super.onCreate(savedInstanceState)

        if (childFragmentManager.fragments.isEmpty()) {
            navigator.setLaunchScreen(screens.FragmentFive())
        }
    }

    override fun onExit() {
        router.exit()
    }


}