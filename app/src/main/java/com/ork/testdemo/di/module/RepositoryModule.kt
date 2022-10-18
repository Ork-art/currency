package com.ork.testdemo.di.module

import com.ork.testdemo.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single {
        MainRepository(get())
    }
}