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
        viewModelScope.launch(Dispatchers.IO) {
            repository.getWeather(35.5,-78.5)
        }

    }

    val weather : LiveData<Weather>
    get() = repository.weather

}

