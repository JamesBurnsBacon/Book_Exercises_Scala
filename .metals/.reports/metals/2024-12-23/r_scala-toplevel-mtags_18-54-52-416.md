error id: file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/.scala-build/Scala_For_The_Impatient_05338cf2ac/src_generated/main/scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.scala:[553..554) in Input.VirtualFile("file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/.scala-build/Scala_For_The_Impatient_05338cf2ac/src_generated/main/scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.scala", "package scala$minusimpatient$minus3e$minuscode.ch2.src.main.scala


final class Exercises$u002Eworksheet$_ {
def args = Exercises$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.sc"""
/*<script>*/
// 1 prints the message on the first line, and empty parentheses on the second line
import scala.compiletime.ops.double
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
//var number7: Int = 7
def countdown(n: Int) =
    var count = n
    while count >= 0 do
      println(count)
      count -= 1
    end while
countdown(7)    

// 7 Write a for loop for computing product of unicode codes of all letters in str.
val h = "Hello"
var product = 1
def unicodeProduct(s: String) =
    for i <- 0 to h.length -1 do
        product *= h(i).toInt
    product

// 8 Solve preceding without writing a loop
def unicodeProduct2(s: String = "Hello") =
    var product = 1
    s.foreach(product *= _)
    product
unicodeProduct2()
//another formatting
def unicodeProduct2a(s: String = "Hello") =
    var product = 1
    s.foreach(c => product *= c)
    product
unicodeProduct2a()

// 9 Write a function that computes the product named product(s: String)
def product(s: String = "Hello") =
    var productTotal = 1
    s.foreach(c => productTotal *= c)
    productTotal
product()

// 10 Make the function recursive
def productRecursive(s: String) : Int =
    if s.length == 0 then 1
    else s.head * productRecursive(s.tail)
productRecursive("Hello")        

// 11 Function computes x^n where n is an integer, recursively
def recursiveExponent(x: BigDecimal, n: Integer) : BigDecimal =
    if n == 0 then 1
    else if n > 0 then
      if n % 2 == 0 then recursiveExponent(x, n / 2) * recursiveExponent(x, n / 2) // + even n's
      else x * recursiveExponent(x,n - 1) // + odd n's
    else 1 / recursiveExponent(x, -n)//negative n's
recursiveExponent(3,3)

// 12 String interpolator
object DateInterpolator {
    import java.time.LocalDate

    extension (sc: StringContext)
        def date(args: Any*): LocalDate =
            val parts = sc.parts.mkString.split("-").map(_.trim)
            if parts.length != 3 then
                throw new IllegalArgumentException("Expected format is 'yyyy-mm-dd'.")
            else
                val year = args(0).asInstanceOf[Int]
                val month = args(1).asInstanceOf[Int] 
                val day = args(2).asInstanceOf[Int]
                LocalDate.of(year, month, day)
}
val year = 2024; val month = 07; val day = 04

import Exercises$u002Eworksheet$_.this.DateInterpolator.date
import DateInterpolator.date
val testDate = date"$year-$month-$day"
println(testDate)  
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
file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/.scala-build/Scala_For_The_Impatient_05338cf2ac/src_generated/main/scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.scala:14: error: expected identifier; obtained lbrace
type {} //Unit
     ^
#### Short summary: 

expected identifier; obtained lbrace