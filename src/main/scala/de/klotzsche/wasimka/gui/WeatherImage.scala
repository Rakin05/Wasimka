package de.klotzsche.wasimka.gui

import de.klotzsche.wasimka.api.CurrentFeeledTemperature

/**
 * Created by Sangga on 26.10.2014.
 */
object WeatherImage {
  def get:String = {
    val currentFeeledTemp = CurrentFeeledTemperature.get
    currentFeeledTemp match {
      case i if i <= 4.0  => filePath("pics/-x-4.jpg")
      case i if i <= 13.0 => filePath("pics/5-13.jpg")
      case i if i <= 17.0 => filePath("pics/13-17.jpg")
      case _ => filePath("pics/18-x.jpg")
    }
  }

  private def filePath(fileName: String): String = {
    getClass.getResource(fileName).toExternalForm
  }
}
