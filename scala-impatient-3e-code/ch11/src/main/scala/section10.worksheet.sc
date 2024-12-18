// An extractor without Option

import scala.math.*

def gcd(a: Int, b: Int): Int = if b == 0 then abs(a) else gcd(b, a % b)

class Fraction(n: Int, d: Int) :
  private val num = if d == 0 then 1 else n * signum(d) / gcd(n, d)
  private val den = if d == 0 then 1 else d * signum(d) / gcd(n, d)
  override def toString = s"$num/$den"
  def *(other: Fraction) = Fraction(num * other.num, den * other.den)

object Fraction :
  def unapply(input: Fraction) = (input.num, input.den)

// An extractor producing a single value

object Number :
  def unapply(input: String): Option[Int] = 
    try 
      Some(input.strip.toInt)
    catch 
      case ex: NumberFormatException => None

val Number(n) = "1729"

// A Boolean extractor

object IsCompound :
  def unapply(input: String) = input.contains(" ")

object Name :
  def unapply(input: String) = 
    val pos = input.indexOf(" ")
    if pos >= 0 then Some((input.substring(0, pos), input.substring(pos + 1)))
    else None

val author = "Peter van der Linden"
val lastNameFirst = 
  author match  
    case Name(first, last @ IsCompound()) => s"not sure how, maybe $last, $first"
      // Matches if the last name is compound, such as van der Linden
    case Name(first, last) => s"$last, $first"
