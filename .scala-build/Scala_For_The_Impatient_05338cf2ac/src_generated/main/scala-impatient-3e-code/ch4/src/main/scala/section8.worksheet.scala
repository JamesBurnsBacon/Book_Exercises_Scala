package scala$minusimpatient$minus3e$minuscode.ch4.src.main.scala


final class section8$u002Eworksheet$_ {
def args = section8$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch4/src/main/scala/section8.worksheet.sc"""
/*<script>*/
// A tuple:
(1, 3.14, "Fred")

// Accessing an element:
val t = (1, 3.14, "Fred")
val second = t(1) // second has type Double

// Alternative one-based accessors:
val third = t._3 // Sets third to "Fred"

// Defining variables by extracting the tuple elements: 
{
  val (first, second, third) = t // Sets first to 1, second to 3.14, third to "Fred"
  s"$first $second $third"
}
{
  val (first, second, _) = t
  s"$first $second"
}

// Concatenating tuples
("x", 3) ++ ("y", 4) // Yields ("x", 3, "y", 4)

// A method that returns a tuple
"New York".partition(_.isUpper) // Yields the pair ("NY", "ew ork")

/*</script>*/ /*<generated>*//*</generated>*/
}

object section8$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section8$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section8$u002Eworksheet_sc.script as `section8.worksheet`

