package com.ork.testdemo.data.api

import com.ork.testdemo.data.model.Currency
import retrofit2.Response

interface ApiHelper {

    suspend fun getCurrency(): Response<List<Currency>>

}