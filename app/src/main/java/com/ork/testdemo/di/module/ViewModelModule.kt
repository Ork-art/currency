package com.ork.testdemo.di.module

import com.ork.testdemo.ui.main.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel {
        MainViewModel(get(),get())
    }
}