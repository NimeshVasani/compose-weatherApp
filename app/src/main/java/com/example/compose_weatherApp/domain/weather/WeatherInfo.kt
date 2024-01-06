package com.example.compose_weatherApp.domain.weather

import com.example.compose_weatherApp.domain.weather.WeatherData

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)
