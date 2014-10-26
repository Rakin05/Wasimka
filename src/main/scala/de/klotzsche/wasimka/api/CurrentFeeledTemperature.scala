package de.klotzsche.wasimka.api

import de.klotzsche.wasimka.weather.WindChill

/**
 * Created by Sangga on 26.10.2014.
 */
object CurrentFeeledTemperature {
  def get : Double = {
    val currentWeather: CurrentWeather = WeatherData.getData
    WindChill.calculate(currentWeather.temperature, currentWeather.windSpeed)
  }
}
