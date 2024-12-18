package scala$minusimpatient$minus3e$minuscode.ch9.src.main.scala


final class section10$u002Eworksheet$_ {
def args = section10$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch9/src/main/scala/section10.worksheet.sc"""
/*<script>*/
val numitemPattern = "([0-9]+) ([a-z]+)".r
for m <- numitemPattern.findAllMatchIn("99 bottles, 98 bottles") do
  println(m.group(1)) // Prints 99 and 98
val numitemPattern(num, item) = "99 bottles"
  // Sets num to "99", item to "bottles"

val str = "97 cans"
str match
  case numitemPattern(num, item) => s"found $num $item"
  case _ => "no match"

def process(num: String, item: String) = println(s"found $num $item")
for numitemPattern(num, item) <- numitemPattern.findAllIn("99 bottles, 98 bottles") do
  process(num, item)

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

