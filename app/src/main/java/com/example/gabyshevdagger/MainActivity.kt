package com.example.gabyshevdagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportFragmentManager.beginTransaction().add(R.id.frameLayout,
            MediatorManager()
                .featureScreenTwoMediator
                .apiStub
                .provideScreenTwo() as Fragment
        ).commit()
    }
}
