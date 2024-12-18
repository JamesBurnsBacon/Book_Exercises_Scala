package scala$minusimpatient$minus3e$minuscode.ch17.src.main.scala


final class section2$u002Eworksheet$_ {
def args = section2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch17/src/main/scala/section2.worksheet.sc"""
/*<script>*/
// A generic function with a type parameter
def getMiddle[T](a: Array[T]) = a(a.length / 2)
// The type parameter is inferred
getMiddle(Array("Mary", "had", "a", "little", "lamb")) // Calls getMiddle[String]
// You can specify the type parameter explicitly
val f = getMiddle[String] // The function, saved in f

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

