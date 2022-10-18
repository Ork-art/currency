package com.ork.testdemo.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ork.testdemo.R
import com.ork.testdemo.ui.main.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

}