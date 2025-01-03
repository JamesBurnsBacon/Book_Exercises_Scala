package scala$minusimpatient$minus3e$minuscode.ch19.src.main.scala


final class section8$u002Eworksheet$_ {
def args = section8$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch19/src/main/scala/section8.worksheet.sc"""
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

val result = 3 * Fraction(4, 5) // Calls int2Fraction(3)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section8$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section8$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section8$u002Eworksheet_sc.script as `section8.worksheet`

