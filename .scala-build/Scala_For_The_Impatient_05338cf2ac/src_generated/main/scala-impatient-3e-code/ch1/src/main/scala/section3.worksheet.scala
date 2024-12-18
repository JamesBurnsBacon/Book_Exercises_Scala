package scala$minusimpatient$minus3e$minuscode.ch1.src.main.scala


final class section3$u002Eworksheet$_ {
def args = section3$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch1/src/main/scala/section3.worksheet.sc"""
/*<script>*/
// Can invoke methods on integer values
1.toString() // Yields the string "1"
1.to(10) // Yields Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// These two expressions are equivalent:
"Hello".intersect("World") // Yields "lo"
scala.collection.StringOps("Hello").intersect("World")

// As are these two:
1.to(10)
scala.runtime.RichInt(1).to(10)

// Type conversions
99.44.toInt
99.toChar

/*</script>*/ /*<generated>*//*</generated>*/
}

object section3$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section3$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section3$u002Eworksheet_sc.script as `section3.worksheet`

