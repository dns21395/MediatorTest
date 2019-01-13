package com.example.featurescreenfourimpl

import com.example.coreutils.global.BaseFragment
import com.example.featurescreenfourapi.FragmentFour
import javax.inject.Inject

class FragmentFourImpl @Inject constructor() : BaseFragment(), FragmentFour {
    override val layoutRes: Int = R.layout.fragment_four
}