package com.bawp.jetweatherforecast.screens.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.bawp.jetweatherforecast.data.DataOrException
import com.bawp.jetweatherforecast.model.Weather
import com.bawp.jetweatherforecast.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: WeatherRepository)
    : ViewModel(){

        suspend fun getWeatherData(city: String, units: String)
        : DataOrException<Weather, Boolean, Exception> {
            val dOE = repository.getWeather(cityQuery = city, units = units)
            Log.d("WEATHERLOR", "ex: "+dOE.e+" data: "+dOE.data.toString())
            return dOE

        }




}