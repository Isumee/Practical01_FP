package com.question01.scala

object question01 {
   def areaOfDisk(r:Double): Double = math.Pi*r*r
   def main(args: Array[String]): Unit = {
      val radius = 5.0
      val area = areaOfDisk(radius)
      println(f"The area of disk is $area")
   }
}
