package com.example.feature.screenone

import android.os.Bundle
import android.view.View
import com.example.coreutils.global.BaseFragment
import com.example.screen_one_api.ScreenOne
import javax.inject.Inject

class ScreenOneImpl @Inject constructor() : BaseFragment(), ScreenOne {

    override val layoutRes: Int = R.layout.my_fragment_2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}