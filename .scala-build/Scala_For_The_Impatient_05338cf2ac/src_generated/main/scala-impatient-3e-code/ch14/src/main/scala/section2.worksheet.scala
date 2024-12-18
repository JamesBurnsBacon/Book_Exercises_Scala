package scala$minusimpatient$minus3e$minuscode.ch14.src.main.scala


final class section2$u002Eworksheet$_ {
def args = section2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch14/src/main/scala/section2.worksheet.sc"""
/*<script>*/
// Guards

var number = 0
var sign = 1
for (ch <- "-123") 
  ch match
    case _ if Character.isDigit(ch) => number = 10 * number + Character.digit(ch, 10)
    case '+' => sign = 1
    case '-' => sign = -1
sign * number

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

