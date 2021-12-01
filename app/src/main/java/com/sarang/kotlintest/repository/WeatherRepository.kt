package com.sarang.kotlintest.repository

import android.util.Log
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sarang.kotlintest.api.WebService
import com.sarang.kotlintest.models.Weather
import kotlin.coroutines.coroutineContext

class WeatherRepository (private val webservice : WebService) {

    private val weatherLiveData  = MutableLiveData<Weather>()

    val weather : LiveData<Weather>
            get() = weatherLiveData


    suspend fun getWeather(lat : Double , lng : Double){
        val result = webservice.getFiveDayForecastRespose(lat,lng)
        if(result?.body()!=null){
            weatherLiveData.postValue(result.body())
        }
        else
            Log.e("Weather",">>>> "+result.toString())

    }
}