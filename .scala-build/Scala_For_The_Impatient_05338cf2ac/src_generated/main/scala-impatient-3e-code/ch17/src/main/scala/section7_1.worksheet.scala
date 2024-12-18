package scala$minusimpatient$minus3e$minuscode.ch17.src.main.scala


final class section7_1$u002Eworksheet$_ {
def args = section7_1$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch17/src/main/scala/section7_1.worksheet.sc"""
/*<script>*/
// A type constraint

class Pair[T](val first: T, val second: T)(using ev: T <:< Comparable[T]) :
  def smaller = if first.compareTo(second) < 0 then first else second

val p = Pair("Fred", "Brooks")
p.smaller

/*</script>*/ /*<generated>*//*</generated>*/
}

object section7_1$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section7_1$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section7_1$u002Eworksheet_sc.script as `section7_1.worksheet`

