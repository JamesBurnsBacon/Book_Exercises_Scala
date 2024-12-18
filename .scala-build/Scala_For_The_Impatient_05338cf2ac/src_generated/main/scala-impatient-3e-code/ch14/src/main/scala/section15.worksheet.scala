package scala$minusimpatient$minus3e$minuscode.ch14.src.main.scala


final class section15$u002Eworksheet$_ {
def args = section15$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch14/src/main/scala/section15.worksheet.sc"""
/*<script>*/
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

/*</script>*/ /*<generated>*//*</generated>*/
}

object section15$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section15$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section15$u002Eworksheet_sc.script as `section15.worksheet`

