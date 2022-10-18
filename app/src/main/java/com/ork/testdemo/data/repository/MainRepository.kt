package com.ork.testdemo.data.repository

import com.ork.testdemo.data.api.ApiHelper


class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getCurrency()
}