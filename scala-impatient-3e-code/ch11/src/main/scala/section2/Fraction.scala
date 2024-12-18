package section2

import scala.annotation.*
import scala.math.*

def gcd(a: Int, b: Int): Int = if b == 0 then abs(a) else gcd(b, a % b)

class Fraction(n: Int, d: Int) :
  private val num = if d == 0 then 1 else n * signum(d) / gcd(n, d)
  private val den = if d == 0 then 1 else d * signum(d) / gcd(n, d)
  override def toString = s"$num/$den"
  @targetName("multiply") def *(other: Fraction) = Fraction(num * other.num, den * other.den)
  infix def times(other: Fraction) = Fraction(num * other.num, den * other.den)
  def repeat(s: =>String) =
    s * (num / den) + s.substring(0, s.length * (num % den) / den)

@main def demo =
  val f = Fraction(2, 5)
  val g = Fraction(3, 4)

  println(f * g)
  println(f times g)
  println(f repeat { "Hello" })
