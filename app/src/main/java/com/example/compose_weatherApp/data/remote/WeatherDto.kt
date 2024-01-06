package com.example.compose_weatherApp.data.remote

import com.example.compose_weatherApp.data.remote.WeatherDataDto
import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)
