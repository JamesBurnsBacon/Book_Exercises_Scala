package com.horstmann.impatient
import section10.Fraction

object FractionConversions :
  given int2Fraction: Conversion[Int, Fraction] = n => Fraction(n, 1)
  given fraction2Double: Conversion[Fraction, Double] = f => f.num * 1.0 / f.den
