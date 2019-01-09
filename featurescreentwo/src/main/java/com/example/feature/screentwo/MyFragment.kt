package com.example.feature.screentwo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.coreutils.flow.SupportAppScreen
import com.example.coreutils.global.BaseFragment
import com.example.feature.screenone.ScreenOne
import com.example.feature.screentwo.di.ScreenTwoComponent
import kotlinx.android.synthetic.main.my_fragment.*
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class MyFragment : BaseFragment() {

    override val layoutRes: Int = R.layout.my_fragment

    @Inject
    lateinit var router: Router

    @Inject
    lateinit var thefragment: ScreenOne

    override fun onCreate(savedInstanceState: Bundle?) {
        ScreenTwoComponent.screenTwoComponent.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myfragment = object : SupportAppScreen() {
            override fun getFragment(): Fragment {
                return thefragment as Fragment
            }
        }

        openScreenTwoButton.setOnClickListener {
            fragmentManager?.beginTransaction()!!
                .add(R.id.frameLayout, thefragment as Fragment)
                .commit()
//            router.newRootScreen(myfragment)
        }
    }
}