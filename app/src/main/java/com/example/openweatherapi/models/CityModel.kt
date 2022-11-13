package com.example.openweatherapi.models

data class CityModel(
    var coord: Coord,
    var country: String,
    var id: Int,
    var name: String,
    var population: Int,
    var sunrise: Int,
    var sunset: Int,
    var timezone: Int
)