package scala$minusimpatient$minus3e$minuscode.ch14.src.main.scala


final class section8$u002Eworksheet$_ {
def args = section8$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch14/src/main/scala/section8.worksheet.sc"""
/*<script>*/
// A pattern can be used to declare variables 

val (a, b) = (1, 2)

// Useful when a function returns a pair

val (q, r) = BigInt(10) /% 3

// Syntax for extractor patterns

val arr = Array(0, 1.7, 2, 9)
val Array(0, second, rest*) = arr

// Caution: Constants start with uppercase letter
import scala.math.*
arr(0) = Pi
val Array(Pi, x, _*) = arr

// This is legal Scala
val 2 = b

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

