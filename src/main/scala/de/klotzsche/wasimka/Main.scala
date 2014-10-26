package de.klotzsche.wasimka

import java.io.File

import de.klotzsche.wasimka.api.CurrentFeeledTemperature

object Main extends App{
  import scala.collection.JavaConversions._
  for(file <- new File("pics/").listFiles ){
    println(file.getAbsolutePath)
  }
}
