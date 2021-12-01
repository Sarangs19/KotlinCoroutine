package com.sarang.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.*
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.sarang.kotlintest.api.RetrofitHelper
import com.sarang.kotlintest.api.WebService
import com.sarang.kotlintest.databinding.ActivityMainBinding
import com.sarang.kotlintest.models.Weather
import com.sarang.kotlintest.repository.WeatherRepository
import com.sarang.kotlintest.viewmodels.MainViewModel
import com.sarang.kotlintest.viewmodels.MainViewModelFactory
import com.sarang.register.RegisterActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Response
import java.time.Duration

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var viewModel : MainViewModel
    lateinit var  weatherRepository : WeatherRepository
    var counter  = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //init databinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //init ui components
       // binding.name = "Welcome to Kotlin"

        binding.etName.hint = "Enter Name"
        binding.save.text = "Get Weather"

        binding.save.setOnClickListener {
            if(binding.etName.text.toString().equals("")){
                binding.etName.setError("Enter Name")
                binding.etName.requestFocus()
            }
            else{
                binding.etName.setText("")
                //Toast.makeText(applicationContext,"Saved",Toast.LENGTH_LONG).show()

                getWeather2()
//                val  intent  = Intent(applicationContext,RegisterActivity::class.java)
//                startActivity(intent)


            }
        }


        //init repository and viewmodels
        val webService  = RetrofitHelper.getInstance().create(WebService::class.java)
         weatherRepository = WeatherRepository(webService)

        viewModel = ViewModelProvider(this, MainViewModelFactory(weatherRepository)).get(MainViewModel::class.java)

        setDataToViews()




    }


    private fun setDataToViews(){
        Handler(Looper.getMainLooper()).post {
        viewModel.weather.observe(this, {
                binding.name = it
                Log.e("TEST", it.toString())
            })
        }

    }

    private fun getWeather(){
        GlobalScope.launch {
            binding.etName.setText("")
              weatherRepository.getWeather(20.890408, 78.989887)
              setDataToViews()
        }
    }

    private fun getWeather2(){
        viewModel.viewModelScope.launch(Dispatchers.Main) {

            when(counter){
                1 -> weatherRepository.getWeather(20.890408, 78.989887)
                2 -> weatherRepository.getWeather(21.027710, 77.65215)
                3 -> weatherRepository.getWeather(21.751468, 77.767389)
                4 -> weatherRepository.getWeather(20.810548, 78.850165)
                5 -> { counter = 0
                    weatherRepository.getWeather(20.890408, 78.989887)}
                    }
            counter++

            setDataToViews()

        }
    }
}