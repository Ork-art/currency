package com.ork.testdemo

import android.app.Application
import com.ork.testdemo.di.module.appModule
import com.ork.testdemo.di.module.repoModule
import com.ork.testdemo.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App:Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}