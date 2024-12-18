package scala$minusimpatient$minus3e$minuscode.ch2.src.main.scala


final class section8$u002Eworksheet$_ {
def args = section8$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch2/src/main/scala/section8.worksheet.sc"""
/*<script>*/
// Default arguments:
def decorate(str: String, left: String = "[", right: String = "]") =
  left + str + right
decorate("Hello", "<<<", ">>>")
decorate("Hello", ">>>[")
decorate(left = "<<<", str = "Hello", right = ">>>")
decorate("Hello", right = "]<<<") // Calls decorate("Hello", "[", "]<<<")

// Variable number of arguments:
def sum(args: Int*) = 
  var result = 0
  for arg <- args do result += arg
  result
sum(1, 4, 9, 16, 25)

// This is an error:
// sum(1 to 5) // Error

// Remedy:
sum((1 to 5)*) // Consider 1 to 5 as an argument sequence

// The * syntax is needed in recursive functions:
def recursiveSum(args: Int*) : Int = 
  if args.length == 0 then 0 
  else args.head + recursiveSum(args.tail*)
recursiveSum(1, 4, 9, 16, 25)

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

