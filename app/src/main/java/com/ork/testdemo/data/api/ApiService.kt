package com.ork.testdemo.data.api

import com.ork.testdemo.data.model.Currency
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/currency")
    suspend fun getCurrency(): Response<List<Currency>>

}