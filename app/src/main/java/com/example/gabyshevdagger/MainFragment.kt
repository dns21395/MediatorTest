package com.example.gabyshevdagger

import android.os.Bundle
import android.view.View
import com.example.coreutils.global.BaseFragment
import com.example.gabyshevdagger.di.MainComponent
import kotlinx.android.synthetic.main.fragment_main.*
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class MainFragment : BaseFragment() {
    @Inject
    lateinit var router: Router

    override val layoutRes: Int = R.layout.fragment_main

    @Inject lateinit var screens: Screens

    override fun onCreate(savedInstanceState: Bundle?) {
        MainComponent.mainComponent.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonOpenTwo.setOnClickListener {
            router.navigateTo(screens.TwoFlow())
        }

        buttonOpenFive.setOnClickListener {
            router.navigateTo(screens.FiveFlow())
        }
    }

    override fun onBackPressed() {
        router.exit()
    }
}