package section8

// Extractors

import scala.math.*

def gcd(a: Int, b: Int): Int = if b == 0 then abs(a) else gcd(b, a % b)

class Fraction(n: Int, d: Int) :
  private val num = if d == 0 then 1 else n * signum(d) / gcd(n, d)
  private val den = if d == 0 then 1 else d * signum(d) / gcd(n, d)
  override def toString = s"$num/$den"
  def *(other: Fraction) = Fraction(num * other.num, den * other.den)

object Fraction :
  def unapply(input: Fraction) = 
    if input.den == 0 then None else Some((input.num, input.den))

object Name :
  def unapply(input: String) = 
    val pos = input.indexOf(" ")
    if pos >= 0 then Some((input.substring(0, pos), input.substring(pos + 1)))
    else None

@main def demo =
  val Fraction(n, d) = Fraction(3, 4) * Fraction(2, 5)
    // n, d are initialized with the numerator and denominator of the result
  println(s"n: $n, d: $d")

  val f = Fraction(3, 4)
  val value = f match
    case Fraction(a, b) => a.toDouble / b // a, b are bound to the numerator and denominator
    case _ => Double.NaN
  println(s"value: $value")

  val author = "Cay Horstmann"
  val Name(first, last) = author // Calls Name.unapply(author)
  println(s"first: $first, last: $last")
