package de.klotzsche.wasimka.gui

import java.io.File

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.image.{ImageView, Image}
import scalafx.scene.paint.Color._

object MainWindow extends JFXApp{
  stage = new PrimaryStage{
    title = "Wasimka"
    scene = new Scene{
      fill = BLACK
      content = new ImageView {
        image = new Image(WeatherImage.get)
        fitWidth = 500
        preserveRatio = true
        smooth = true
      }
    }
  }
}
