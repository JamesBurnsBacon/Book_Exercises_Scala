error id: file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/.scala-build/Scala_For_The_Impatient_05338cf2ac/src_generated/main/scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.scala:[466..467) in Input.VirtualFile("file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/.scala-build/Scala_For_The_Impatient_05338cf2ac/src_generated/main/scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.scala", "package scala$minusimpatient$minus3e$minuscode.ch2.src.main.scala


final class Exercises$u002Eworksheet$_ {
def args = Exercises$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.sc"""
/*<script>*/
// 1 prints the message on the first line, and empty parentheses on the second line
//It prints the parentheses as if literal
println(println("Hello"))

// 2 value of empty block expression {}
type {}


/*</script>*/ /*<generated>*//*</generated>*/
}

object Exercises$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new Exercises$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export Exercises$u002Eworksheet_sc.script as `Exercises.worksheet`

")
file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/.scala-build/Scala_For_The_Impatient_05338cf2ac/src_generated/main/scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.scala:13: error: expected identifier; obtained lbrace
type {}
     ^
#### Short summary: 

expected identifier; obtained lbrace