package scala$minusimpatient$minus3e$minuscode.ch14.src.main.scala


final class section12$u002Eworksheet$_ {
def args = section12$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch14/src/main/scala/section12.worksheet.sc"""
/*<script>*/
// This match is exhaustive:

val scores = Map("Alice" -> 10, "Bob" -> 6, "Cindy" -> 8)
scores.get("Alice") match
  case Some(score) => println(score)
  case None => println("No score")

// The @unchecked annotation suppresses warnings for non-exhaustive matches:

(scores.get("Alice"): @unchecked) match
  case Some(score) => println(score)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section12$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section12$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section12$u002Eworksheet_sc.script as `section12.worksheet`

