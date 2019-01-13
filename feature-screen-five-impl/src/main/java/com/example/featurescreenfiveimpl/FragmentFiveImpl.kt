package com.example.featurescreenfiveimpl

import android.os.Bundle
import com.example.coreutils.global.BaseFragment
import com.example.featurescreenfiveapi.FragmentFive
import com.example.featurescreenfiveimpl.di.FragmentFiveComponent
import javax.inject.Inject

class FragmentFiveImpl @Inject constructor() : BaseFragment(), FragmentFive {

    override val layoutRes: Int = R.layout.fragment_five

    override fun onCreate(savedInstanceState: Bundle?) {
        FragmentFiveComponent.component.inject(this)
        super.onCreate(savedInstanceState)
    }
}