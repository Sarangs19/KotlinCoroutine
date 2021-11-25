package com.sarang.kotlintest.api

import com.sarang.kotlintest.models.ResponseWeather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface WebService {

    @GET("/3hourly/{lat}&{lon}")
    suspend fun getFiveDayForecast(@Path("lat") lat : Double, @Path("lon") lon : Double) : ResponseWeather


 @GET("/3hourly/{lat}&{lon}")
    suspend fun getFiveDayForecastRespose(@Path("lat") lat : Double, @Path("lon") lon : Double) : Response<ResponseWeather>
    }

