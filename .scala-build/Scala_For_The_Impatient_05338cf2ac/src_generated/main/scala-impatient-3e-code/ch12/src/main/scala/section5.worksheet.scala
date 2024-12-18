package scala$minusimpatient$minus3e$minuscode.ch12.src.main.scala


final class section5$u002Eworksheet$_ {
def args = section5$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch12/src/main/scala/section5.worksheet.sc"""
/*<script>*/
// Useful higher-order functions

(1 to 9).map(0.1 * _)
(1 to 9).map("*" * _).foreach(println _)
(1 to 9).filter(_ % 2 == 0) // 2, 4, 6, 8
(1 to 9).reduceLeft(_ * _)
"Mary had a little lamb".split(" ").sortWith(_.length < _.length)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section5$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section5$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section5$u002Eworksheet_sc.script as `section5.worksheet`

