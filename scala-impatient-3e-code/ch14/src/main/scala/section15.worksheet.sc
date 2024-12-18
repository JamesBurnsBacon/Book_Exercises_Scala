// Silly infix example

abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount

val price = Currency(100, "CHF")
price match
  case value Currency "CHF" => s"$value Swiss francs" // Same as case Currency(value, "CHF")

// An infix extractor

import scala.math.*

def gcd(a: Int, b: Int): Int = if b == 0 then abs(a) else gcd(b, a % b)

class Fraction(n: Int, d: Int) :
  val num = if d == 0 then 1 else n * signum(d) / gcd(n, d)
  val den = if d == 0 then 1 else d * signum(d) / gcd(n, d)
  override def toString = s"$num/$den"
  def *(other: Fraction) = Fraction(num * other.num, den * other.den)

object Fraction :
  object / :
    def unapply(input: Fraction) = (input.num, input.den)

import Fraction./

Fraction(3, 4) * Fraction(5, 6) match 
  case n / d => n * 1.0 / d
