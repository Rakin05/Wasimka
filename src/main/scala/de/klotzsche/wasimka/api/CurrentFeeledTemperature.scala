package de.klotzsche.wasimka.api

import de.klotzsche.wasimka.weather.WindChill


object CurrentFeeledTemperature {
  def get = {
    val currentWeather: CurrentWeather = WeatherData.getData
    WindChill.calculate(currentWeather.temperature, currentWeather.windSpeed)
  }
}
