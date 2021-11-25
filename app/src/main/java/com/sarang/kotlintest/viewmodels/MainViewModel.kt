package com.sarang.kotlintest.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sarang.kotlintest.models.ResponseWeather
import com.sarang.kotlintest.repository.WeatherRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: WeatherRepository) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getWeather(25.44,73.33)
        }

    }

    val weather : LiveData<ResponseWeather>
    get() = repository.weather

}

