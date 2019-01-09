package com.example.feature.screentwo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.Navigator
import com.example.coreutils.flow.SupportAppNavigator
import com.example.coreutils.global.FlowFragment
import com.example.coreutils.setLaunchScreen
import com.example.feature.screenone.ScreenOne
import com.example.feature.screentwo.di.ScreenTwoComponent
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.commands.Command
import javax.inject.Inject

class ScreenTwoImpl : FlowFragment(), ScreenTwo {

    override fun onCreate(savedInstanceState: Bundle?) {
        ScreenTwoComponent.screenTwoComponent.inject(this)
        super.onCreate(savedInstanceState)
        if (childFragmentManager.fragments.isEmpty()) {
            navigator.setLaunchScreen(Screens.MyFragment)
        }
    }
}