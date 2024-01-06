package com.example.compose_weatherApp.presentation

import com.example.compose_weatherApp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
