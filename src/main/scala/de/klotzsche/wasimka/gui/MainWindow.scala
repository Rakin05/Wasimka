package de.klotzsche.wasimka.gui

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.paint.Color._

object MainWindow extends JFXApp{
  stage = new PrimaryStage{
    title = "Wasimka"
    scene = new Scene{
      fill = BLACK
    }
  }
}
