package com.sarang.kotlintest.api

import com.sarang.kotlintest.models.ResponseWeather
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface WebService {

    @GET("/3hourly/{lat}&{lon}")
    fun getFiveDayForecast(@Path("lat") lat : Double, @Path("lon") lon : Double) : ResponseWeather
    }

