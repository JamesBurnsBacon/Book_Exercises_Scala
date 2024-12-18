package scala$minusimpatient$minus3e$minuscode.ch13.src.main.scala


final class section10$u002Eworksheet$_ {
def args = section10$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch13/src/main/scala/section10.worksheet.sc"""
/*<script>*/
val prices = List(5.0, 20.0, 9.95)
val quantities = List(10, 2, 1)
prices.zip(quantities)
prices.zip(quantities).map(_ * _)
prices.zip(quantities).map(_ * _).sum
List(5.0, 20.0, 9.95).zip(List(10, 2))
List(5.0, 20.0, 9.95).zipAll(List(10, 2), 0.0, 1)
"Scala".zipWithIndex
"Scala".zipWithIndex.max

/*</script>*/ /*<generated>*//*</generated>*/
}

object section10$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section10$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section10$u002Eworksheet_sc.script as `section10.worksheet`

