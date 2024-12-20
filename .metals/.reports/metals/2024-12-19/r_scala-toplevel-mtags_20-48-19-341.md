error id: file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/.scala-build/Scala_For_The_Impatient_05338cf2ac/src_generated/main/scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.scala:[516..517) in Input.VirtualFile("file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/.scala-build/Scala_For_The_Impatient_05338cf2ac/src_generated/main/scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.scala", "package scala$minusimpatient$minus3e$minuscode.ch2.src.main.scala


final class Exercises$u002Eworksheet$_ {
def args = Exercises$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.sc"""
/*<script>*/
// 1 prints the message on the first line, and empty parentheses on the second line
//It prints the parentheses as if literal
println(println("Hello"))

// 2 value and type of empty block expression {}, has only the absence of meaningful data
type {} //Unit
 
// 3  assignment where x = y = 1 is valid
var i: Any = 0
var j = 0

i = j = 1 // Does not set i to 1

// 4 Scala loop from Java syntax: for(int i = 10, i >= 0; i--)System.out.println(i);
var i :Int = 10
while i >= 0 do
  println(i)
  i -= 1
end while

// 5 the signum of a number is 1 if positive, -1 if negative, and zero if 0
def signum(n: Double) =
    def abs(x: Double) = if x >= 0 then x else -x
    if n != 0 then
        n/abs(n)
    else
        0

// 6 function countdown(n:Int) that prints the numbers from n to 0 w/o returning val
//var n: Int = 7
def countdown(n: Int) =
    while n >= 0 do
      println(n)
      n -= 1
    end while
countdown(4)    
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
type {} //Unit
     ^
#### Short summary: 

expected identifier; obtained lbrace