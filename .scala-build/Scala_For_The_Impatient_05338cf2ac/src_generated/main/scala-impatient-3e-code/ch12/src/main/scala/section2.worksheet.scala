package scala$minusimpatient$minus3e$minuscode.ch12.src.main.scala


final class section2$u002Eworksheet$_ {
def args = section2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch12/src/main/scala/section2.worksheet.sc"""
/*<script>*/
// Anonymous functions

(x: Double) => 3 * x
val triple = (x: Double) => 3 * x
  // just like def triple(x: Double) = 3 * x
Array(3.14, 1.42, 2.0).map((x: Double) => 3 * x)
  // Array(9.42, 4.26, 6.0)
// Can also use braces
Array(3.14, 1.42, 2.0).map{ (x: Double) => 3 * x }
// More common with infix notation
Array(3.14, 1.42, 2.0) map { (x: Double) => 3 * x }

// No "eta expansion" when parameterless
def heads() = scala.math.random() < 0.5
heads _
heads()

/*</script>*/ /*<generated>*//*</generated>*/
}

object section2$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section2$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section2$u002Eworksheet_sc.script as `section2.worksheet`

