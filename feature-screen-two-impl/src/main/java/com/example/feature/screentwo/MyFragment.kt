package com.example.feature.screentwo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.coreutils.flow.SupportAppScreen
import com.example.coreutils.global.BaseFragment
import com.example.screen_one_api.ScreenOne
import com.example.feature.screentwo.di.ScreenTwoComponent
import kotlinx.android.synthetic.main.my_fragment.*
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class MyFragment : BaseFragment() {

    override val layoutRes: Int = R.layout.my_fragment_2

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
            override fun getFragment(): BaseFragment {
                return thefragment as BaseFragment
            }
        }

        openScreenTwoButton.setOnClickListener {
            fragmentManager?.beginTransaction()!!
                .add(R.id.frameLayout, thefragment as Fragment)
                .commit()
//            router.newRootScreen(myfragment)
        }
    }

    override fun onBackPressed() {
        router.exit()
    }
}