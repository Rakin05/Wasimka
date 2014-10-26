package de.klotzsche.wasimka

import de.klotzsche.wasika.WindChill
import org.scalatest.{Matchers, FlatSpec}

class WindChillTest extends FlatSpec with Matchers{
  "Windchill" should "stay the same if below 6.44 Km/H" in {
    val temperature = 12.16
    val windSpeed = 4.00
    val result:Double = WindChill.calculate(temperature, windSpeed)

    result should equal(12.2)
  }

  "Windchill" should "calculate the correct feeled temperature" in {
    val temperature = 12.16
    val windSpeed = 8.00

    val result: Double = WindChill.calculate(temperature, windSpeed)

    result should be (11.5)
  }
}
