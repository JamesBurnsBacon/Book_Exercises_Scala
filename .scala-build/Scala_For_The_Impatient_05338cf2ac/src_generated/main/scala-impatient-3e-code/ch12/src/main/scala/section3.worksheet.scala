package scala$minusimpatient$minus3e$minuscode.ch12.src.main.scala


final class section3$u002Eworksheet$_ {
def args = section3$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch12/src/main/scala/section3.worksheet.sc"""
/*<script>*/
// Parameters that are functions

import scala.math.*
def valueAtOneQuarter(f: (Double) => Double) = f(0.25)
valueAtOneQuarter(ceil) // 1.0
valueAtOneQuarter(sqrt) // 0.5 (because 0.5 × 0.5 = 0.25)
def mulBy(factor : Double) = (x : Double) => factor * x
val quintuple = mulBy(5)
quintuple(20) // 100

/*</script>*/ /*<generated>*//*</generated>*/
}

object section3$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section3$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section3$u002Eworksheet_sc.script as `section3.worksheet`

