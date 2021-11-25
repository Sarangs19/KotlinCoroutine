package com.sarang.kotlintest.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sarang.kotlintest.repository.WeatherRepository

class MainViewModelFactory(private val repository: WeatherRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       return  MainViewModel(repository) as T
    }
}