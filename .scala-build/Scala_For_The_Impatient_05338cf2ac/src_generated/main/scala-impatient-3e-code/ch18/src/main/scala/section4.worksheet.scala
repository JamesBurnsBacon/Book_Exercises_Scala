package scala$minusimpatient$minus3e$minuscode.ch18.src.main.scala


final class section4$u002Eworksheet$_ {
def args = section4$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch18/src/main/scala/section4.worksheet.sc"""
/*<script>*/
type Appendable = { def append(str: String): Any }

def appendLines(target: Appendable, lines: Iterable[String]) =
  import reflect.Selectable.reflectiveSelectable
  for l <- lines do
    target.append(l); // Ok
    target.append("\n") // Ok

val sb = StringBuilder()
appendLines(sb, "Mary had a little lamb".split(" "))    
sb

val appender: Appendable = new :
  def append(str: String): Any = println(str)

appendLines(appender, "Mary had a little lamb".split(" "))

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

