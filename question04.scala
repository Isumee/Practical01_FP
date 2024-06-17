package com.question04.scala

object question04 {
  private def discountPrice(n:Double):Double = 24.95*0.4*n
  private def shippingCost(n:Double):Double = if (n<=50) {3*n} else {3*n+75*(n-50)}
  def wholesaleCost(n:Double):Double = shippingCost(n)+24.95*n-discountPrice(n)
}
