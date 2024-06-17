package com.question05.scala

object question05 {
  private def easyPace(l:Int):Int=l*8
  private def TempoPace(l:Int):Int=l*7
  def totalTime(l1:Int,l2:Int,l3:Int):Int=easyPace(l1)+TempoPace(l2)+easyPace(l3)
}
