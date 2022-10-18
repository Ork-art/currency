package com.ork.testdemo.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class Currency(
    val name:String,
    val value:String
)