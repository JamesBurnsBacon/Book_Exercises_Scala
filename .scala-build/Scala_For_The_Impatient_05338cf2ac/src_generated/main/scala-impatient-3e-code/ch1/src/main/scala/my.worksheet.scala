package scala$minusimpatient$minus3e$minuscode.ch1.src.main.scala


final class my$u002Eworksheet$_ {
def args = my$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch1/src/main/scala/my.worksheet.sc"""
/*<script>*/
val answer = 6 * 7
answer * 0.5
("String " + answer).toLowerCase
answer.toDouble
/*</script>*/ /*<generated>*//*</generated>*/
}

object my$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new my$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export my$u002Eworksheet_sc.script as `my.worksheet`

