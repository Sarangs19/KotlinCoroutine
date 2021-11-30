package com.sarang.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.sarang.kotlintest.api.RetrofitHelper
import com.sarang.kotlintest.api.WebService
import com.sarang.kotlintest.databinding.ActivityMainBinding
import com.sarang.kotlintest.repository.WeatherRepository
import com.sarang.kotlintest.viewmodels.MainViewModel
import com.sarang.kotlintest.viewmodels.MainViewModelFactory
import com.sarang.register.RegisterActivity
import java.time.Duration

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //init databinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //init ui components
       // binding.name = "Welcome to Kotlin"

        binding.etName.hint = "Enter Name"
        binding.save.text = "Save"

        binding.save.setOnClickListener {
            if(binding.etName.text.toString().equals("")){
                binding.etName.setError("Enter Name")
                binding.etName.requestFocus()
            }
            else{
                binding.etName.setText("")
                Toast.makeText(applicationContext,"Saved",Toast.LENGTH_LONG).show()

                val  intent  = Intent(applicationContext,RegisterActivity::class.java)
                startActivity(intent)
            }
        }


        //init repository and viewmodels
        val webService  = RetrofitHelper.getInstance().create(WebService::class.java)
        val weatherRepository = WeatherRepository(webService)

        viewModel = ViewModelProvider(this, MainViewModelFactory(weatherRepository)).get(MainViewModel::class.java)

        viewModel.weather.observe(this, {
            binding.name = it
                Log.e("TEST", it.toString())
        })




    }
}