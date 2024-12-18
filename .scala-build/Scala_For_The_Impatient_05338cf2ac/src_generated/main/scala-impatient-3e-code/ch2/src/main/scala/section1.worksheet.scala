package scala$minusimpatient$minus3e$minuscode.ch2.src.main.scala


final class section1$u002Eworksheet$_ {
def args = section1$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch2/src/main/scala/section1.worksheet.sc"""
/*<script>*/
// In Scala, "if" is an expression with a value:
val x = -1
if x > 0 then 1 else -1

// You can assign the value to a variable:
val s = if x > 0 then 1 else -1

// That is nicer than making an assignment in each branch: 
var t = 0
if x > 0 then t = 1 else t = -1

// With branches of different types, the result has the common supertype
if x > 0 then "positive" else -1

// If the "else" branch is missing, it has type Unit:
if x > 0 then "positive"

// To see the Unit result, we print it:
println(if x > 0 then "positive")

// A missing "else" is no problem with a "then" branch of type Unit:
if x < 0 then println("negative")

/*</script>*/ /*<generated>*//*</generated>*/
}

object section1$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section1$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section1$u002Eworksheet_sc.script as `section1.worksheet`

