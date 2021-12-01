package com.sarang.kotlintest.api

import com.sarang.kotlintest.models.Weather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface WebService {

    @GET("/forecast/3hourly?lat={lat}&lon={lon}")
    suspend fun getFiveDayForecast(@Path("lat") lat : Double,
                                   @Path("lon") lon : Double) : Weather


    @GET("/forecast/3hourly")
    suspend fun getFiveDayForecastRespose(@Query("lat") lat : Double,
                                          @Query("lon") lon : Double) : Response<Weather>
    }

