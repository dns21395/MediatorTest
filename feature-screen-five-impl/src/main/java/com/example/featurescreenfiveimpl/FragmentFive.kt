package com.example.featurescreenfiveimpl

import android.os.Bundle
import com.example.coreutils.flow.FlowRouter
import com.example.coreutils.global.BaseFragment
import com.example.featurescreenfiveimpl.di.FragmentFiveComponent
import javax.inject.Inject

class FragmentFive : BaseFragment() {
    @Inject
    lateinit var flowRouter: FlowRouter

    override val layoutRes: Int = R.layout.fragment_five

    override fun onCreate(savedInstanceState: Bundle?) {
        FragmentFiveComponent.component.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onBackPressed() {
        flowRouter.exit()
    }
}