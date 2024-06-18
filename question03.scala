package com.question03.scala

object question03 {
  def volumeOfSphere(r:Double):Double = 4/3*math.Pi*math.pow(r,3)
  def main(args: Array[String]): Unit = {
    val radius = 5.0
    val volume = volumeOfSphere(radius)
    println(f"The area of disk is $volume")
  }
}
