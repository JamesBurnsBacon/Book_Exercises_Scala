import scala.language.implicitConversions
import scala.annotation.*
import scala.math.*

def gcd(a: Int, b: Int): Int = if b == 0 then abs(a) else gcd(b, a % b)

class Fraction(n: Int, d: Int) :
  val num = if d == 0 then 1 else n * signum(d) / gcd(n, d)
  val den = if d == 0 then 1 else d * signum(d) / gcd(n, d)
  override def toString = s"$num/$den"
  @targetName("multiply") def *(other: Fraction) = Fraction(num * other.num, den * other.den)

given int2Fraction: Conversion[Int, Fraction] = n => Fraction(n, 1)

val result = 3 * Fraction(4, 5) // Calls int2Fraction(3)
