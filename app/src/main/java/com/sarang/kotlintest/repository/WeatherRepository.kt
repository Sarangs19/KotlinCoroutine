package com.sarang.kotlintest.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sarang.kotlintest.api.WebService
import com.sarang.kotlintest.models.ResponseWeather

class WeatherRepository (private val webservice : WebService) {

    private val weatherLiveData : MutableLiveData<ResponseWeather>
        get() {
            TODO()
        }


    val weather : LiveData<ResponseWeather>

            get() = weatherLiveData






    suspend fun getWeather(lat : Double , lng : Double){
        val result = webservice.getFiveDayForecastRespose(lat,lng)
        if(result?.body()!=null){
            weatherLiveData.postValue(result.body())
        }
    }
}