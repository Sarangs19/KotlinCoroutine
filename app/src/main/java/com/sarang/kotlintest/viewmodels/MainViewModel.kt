package com.sarang.kotlintest.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sarang.kotlintest.models.Weather
import com.sarang.kotlintest.repository.WeatherRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: WeatherRepository) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.Main) {
            repository.getWeather(20.747264, 78.602957)
            repository.getWeather(20.890408, 78.989887)
            repository.getWeather(21.027710, 77.767389)
            repository.getWeather(20.890408, 78.989887)
            repository.getWeather(20.747264, 78.602957)

        }
    }



    val weather : LiveData<Weather>
    get() = repository.weather

}

