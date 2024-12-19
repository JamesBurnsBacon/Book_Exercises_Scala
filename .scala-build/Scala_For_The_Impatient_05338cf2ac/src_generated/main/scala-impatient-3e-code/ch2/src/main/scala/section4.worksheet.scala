package scala$minusimpatient$minus3e$minuscode.ch2.src.main.scala


final class section4$u002Eworksheet$_ {
def args = section4$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch2/src/main/scala/section4.worksheet.sc"""
/*<script>*/
// print is like println, but doesn't add a newline: 
print("Answer: ")
println(42)

// You can use string concatenation for complex outputs:
println("Answer: " + 42)

// For formatted output, use the f interpolator: 
val name = "Fred"
val age = 42
println(f"Hello, $name! In six months, you'll be ${age + 0.5}%7.2f years old.")
//need brackets around expressions that are not variable names
// The raw interpolator:
raw"\n is a newline"

// Double an actual dollar in an interpolated string: 
val price = 19.95
f"$$$price: a 50%% discount"

/*</script>*/ /*<generated>*//*</generated>*/
}

object section4$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section4$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section4$u002Eworksheet_sc.script as `section4.worksheet`

