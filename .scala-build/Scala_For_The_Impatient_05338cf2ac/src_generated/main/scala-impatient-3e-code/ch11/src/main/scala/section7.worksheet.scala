package scala$minusimpatient$minus3e$minuscode.ch11.src.main.scala


final class section7$u002Eworksheet$_ {
def args = section7$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch11/src/main/scala/section7.worksheet.sc"""
/*<script>*/
// The apply and update methods
val scores = scala.collection.mutable.HashMap[String, Int]()
scores("Bob") = 100 // Calls scores.update("Bob", 100)
val bobsScore = scores("Bob") // Calls scores.apply("Bob")
scores.update("Alice", 95)
scores.apply("Alice")
scores

/*</script>*/ /*<generated>*//*</generated>*/
}

object section7$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section7$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section7$u002Eworksheet_sc.script as `section7.worksheet`

