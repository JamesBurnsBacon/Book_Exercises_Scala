package scala$minusimpatient$minus3e$minuscode.ch14.src.main.scala


final class section7$u002Eworksheet$_ {
def args = section7$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch14/src/main/scala/section7.worksheet.sc"""
/*<script>*/
// Array object is an extractor with an unapply method

val arr = Array(1, 7, 2, 9)

arr match
  case Array(x, 0) => x
  case Array(_, rest*) => rest.min
  
Array.unapplySeq(arr)

// A regex pattern is an extractor

val pattern = "([0-9]+) ([a-z]+)".r
"99 bottles" match
  case pattern(quantity, item) => s"{ quantity: $quantity, item: $item }"
    // Sets quantity to "99", item to "bottles"

pattern.unapplySeq("99 bottles")

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

