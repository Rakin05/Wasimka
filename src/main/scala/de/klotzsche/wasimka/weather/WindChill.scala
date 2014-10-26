package de.klotzsche.wasimka.weather

object WindChill {
  def calculate(temperature: Double, windSpeed: Double): Double = {
    if(windSpeed <= 6.44) return roundToOneDecimal(temperature)
    val windChill = 13.12 + 0.6215 * temperature - 11.37*Math.pow(windSpeed,0.16) + 0.3965*temperature*Math.pow(windSpeed,0.16)

    roundToOneDecimal(windChill)
  }

  private def roundToOneDecimal(number: Double) = (number * 10).round / 10.toDouble
}
