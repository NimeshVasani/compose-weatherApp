package com.example.compose_weatherApp.domain.repository

import com.example.compose_weatherApp.domain.util.Resource
import com.example.compose_weatherApp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}