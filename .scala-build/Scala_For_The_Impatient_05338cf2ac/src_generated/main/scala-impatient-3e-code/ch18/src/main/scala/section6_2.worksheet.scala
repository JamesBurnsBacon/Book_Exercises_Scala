package scala$minusimpatient$minus3e$minuscode.ch18.src.main.scala


final class section6_2$u002Eworksheet$_ {
def args = section6_2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch18/src/main/scala/section6_2.worksheet.sc"""
/*<script>*/
// A class with a "fluent" interface
object Title // This object is used an an argument for a fluent interface

class Document :
  private var title = ""
  private var useNextArgAs: Any = null
  def set(obj: Title.type): this.type = { useNextArgAs = obj; this }
  def to(arg: String) = if (useNextArgAs == Title) title = arg // else ...
  override def toString = getClass.getName + "[title=" + title + "]"

val book = new Document
book set Title to "Scala for the Impatient"
book

/*</script>*/ /*<generated>*//*</generated>*/
}

object section6_2$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section6_2$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section6_2$u002Eworksheet_sc.script as `section6_2.worksheet`

