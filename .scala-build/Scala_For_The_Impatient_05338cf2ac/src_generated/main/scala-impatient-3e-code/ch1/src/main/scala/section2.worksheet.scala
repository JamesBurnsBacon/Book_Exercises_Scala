package scala$minusimpatient$minus3e$minuscode.ch1.src.main.scala


final class section2$u002Eworksheet$_ {
def args = section2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch1/src/main/scala/section2.worksheet.sc"""
/*<script>*/
val answer = 8 * 5 + 2

// You cannot assign a new value to a "val"
// answer = 0
var counter = 0
counter = 1 // OK, can change a var

// Specifying types
val message: String = null
val greeting: Any = "Hello"

// Defining multiple variables
val xmax, ymax = 100 // Sets xmax and ymax to 100
var prefix, suffix: String = null
  // prefix and suffix are both strings, initialized with null

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

