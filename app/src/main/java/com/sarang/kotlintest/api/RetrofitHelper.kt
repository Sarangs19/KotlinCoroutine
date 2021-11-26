package com.sarang.kotlintest.api

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.internal.connection.ConnectInterceptor.intercept
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException
import java.util.concurrent.TimeUnit

object RetrofitHelper {
    private const val BASE_URL = "https://weatherbit-v1-mashape.p.rapidapi.com/"

    private val interceptor = run {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.apply {
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BASIC
            httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        }
    }


    private val okHttpClient = OkHttpClient.Builder()
        .addNetworkInterceptor(interceptor) // same for .addInterceptor(...)
        .connectTimeout(30, TimeUnit.SECONDS) //Backend is really slow
        .writeTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .addInterceptor{ it.proceed(it.request().newBuilder()
            .addHeader("x-rapidapi-host", "weatherbit-v1-mashape.p.rapidapi.com")
            .addHeader("x-rapidapi-key", "94cb7d2f7dmsh7fd277cca2838a0p1b9242jsn2d1aa961a539")
            .build())}


        .build()




    fun getInstance () : Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)

            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}