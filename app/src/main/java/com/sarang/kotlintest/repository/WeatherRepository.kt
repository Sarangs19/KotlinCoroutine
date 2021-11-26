package com.sarang.kotlintest.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sarang.kotlintest.api.WebService
import com.sarang.kotlintest.models.Weather

class WeatherRepository (private val webservice : WebService) {

    private val weatherLiveData  = MutableLiveData<Weather>()

    val weather : LiveData<Weather>
            get() = weatherLiveData


    suspend fun getWeather(lat : Double , lng : Double){
        val result = webservice.getFiveDayForecastRespose(lat,lng)
        if(result?.body()!=null){
            weatherLiveData.postValue(result.body())
        }
    }
}