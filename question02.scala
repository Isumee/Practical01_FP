package com.question02.scala

object question02 {
  def convertTemperature(t:Double):Double=t*1.8000+32.00
   def main(args: Array[String]): Unit = {
    val cel = 35.0
    val fahrenheit = convertTemperature(cel)
    println(f"Fahrenheit temperature is $fahrenheit")
  }
}
