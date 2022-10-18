package com.ork.testdemo.data.api

import com.ork.testdemo.data.model.Currency
import retrofit2.Response


class ApiHelperImpl(private val apiService: ApiService): ApiHelper {

    override suspend fun getCurrency(): Response<List<Currency>>  = apiService.getCurrency()
}