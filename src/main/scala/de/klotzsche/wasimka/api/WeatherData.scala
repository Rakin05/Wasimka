package de.klotzsche.wasimka.api

import play.api.libs.json._

case class CurrentWeather(temperature: Double, windSpeed: Double)

object WeatherData{
    def getData: CurrentWeather = {
    val rawJson = scala.io.Source.fromURL("http://api.openweathermap.org/data/2.5/weather?id=2935022&units=metric").mkString
    val json = Json.parse(rawJson)

    val currentTemp = (json \ "main" \ "temp").asOpt[Double]
    val currentWindSpeed = (json \ "wind" \ "speed").asOpt[Double]

    new CurrentWeather(currentTemp.getOrElse(0.0), currentWindSpeed.getOrElse(0.0))
  }
}