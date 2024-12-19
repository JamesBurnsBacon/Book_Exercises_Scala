package scala$minusimpatient$minus3e$minuscode.ch1.src.main.scala


final class section6$u002Eworksheet$_ {
def args = section6$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch1/src/main/scala/section6.worksheet.sc"""
/*<script>*/
// Parentheses are also used for element access: 
val s = "Hello"
s(4) // Yields 'o'

// This call doesn't work
// "Bonjour".sorted(3)

// Remedy:
val result = "Bonjour".sorted
result(3)

// or
"Bonjour".sorted.apply(3)

// These two expressions are equivalent:
BigInt("1234567890")
BigInt.apply("1234567890")

// You don't need "new" to construct objects: 
BigInt("1234567890") * BigInt("112358111321")

// The concat method accepts any IterableOnce[Char], here from a range:
"bob".concat('c'.to('z')) // Yields "bobcdefghijklmnopqrstuvwxyz"

// When in doubt, try it out in the REPL or a worksheet:
"Scala".sorted // Yields "Saacl"
/*</script>*/ /*<generated>*//*</generated>*/
}

object section6$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section6$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section6$u002Eworksheet_sc.script as `section6.worksheet`

