package scala$minusimpatient$minus3e$minuscode.ch19.src.main.scala


final class section9$u002Eworksheet$_ {
def args = section9$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch19/src/main/scala/section9.worksheet.sc"""
/*<script>*/
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

// Implicit conversions are attempted in two distinct situations
// 1. Type of an argument differs from the expected type
Fraction(3, 4) * 5 // Calls int2Fraction(5)

// 2. Receiver object accesses a nonexistent member 
3 * Fraction(4, 5) // Calls int2Fraction(3)

// This is NOT ambiguous
{
  given fraction2Double: Conversion[Fraction, Double] = f => f.num * 1.0 / f.den

  3 * Fraction(4, 5)

  // 3 * fraction2Double(Fraction(4, 5))
  // is preferred over
  // int2Fraction(3) * Fraction(4, 5)
  // since it doesn't require modification of the receiver
}

/*</script>*/ /*<generated>*//*</generated>*/
}

object section9$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section9$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section9$u002Eworksheet_sc.script as `section9.worksheet`

