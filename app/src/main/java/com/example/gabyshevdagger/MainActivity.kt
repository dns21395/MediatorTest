package com.example.gabyshevdagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.example.coreutils.flow.SupportAppNavigator
import com.example.gabyshevdagger.di.MainComponent
import kotlinx.android.synthetic.main.activity_main.*
import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.commands.Command
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var router: Router

    @Inject lateinit var navigatorHolder: NavigatorHolder

    private val currentFragment: Fragment?
        get() = supportFragmentManager.findFragmentById(R.id.container) as? Fragment

    private val navigator: Navigator =
        object : SupportAppNavigator(this, supportFragmentManager, R.id.container) {
            override fun setupFragmentTransaction(
                command: Command?,
                currentFragment: Fragment?,
                nextFragment: Fragment?,
                fragmentTransaction: FragmentTransaction
            ) {
                //fix incorrect order lifecycle callback of MainFlowFragment
                fragmentTransaction.setReorderingAllowed(true)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        MainComponent.mainComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        router.newRootScreen(Screens.TwoFlow)
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }
}
