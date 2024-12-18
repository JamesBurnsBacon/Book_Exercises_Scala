package scala$minusimpatient$minus3e$minuscode.ch12.src.main.scala


final class section4$u002Eworksheet$_ {
def args = section4$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch12/src/main/scala/section4.worksheet.sc"""
/*<script>*/
// Parameter inference

def valueAtOneQuarter(f: (Double) => Double) = f(0.25)
valueAtOneQuarter((x: Double) => 3 * x) // 0.75
valueAtOneQuarter((x) => 3 * x)
valueAtOneQuarter(x => 3 * x)
valueAtOneQuarter(3 * _)
/*
// The following does not work:
val fun = 3 * _ // Error: Can’t infer types
*/
// Remedy:
3 * (_: Double) // OK
val fun: (Double) => Double = 3 * _ // OK because we specified the type for fun
// Turning methods into functions:
(_: String).length
(_: String).substring(_:Int, _: Int)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section4$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section4$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section4$u002Eworksheet_sc.script as `section4.worksheet`

