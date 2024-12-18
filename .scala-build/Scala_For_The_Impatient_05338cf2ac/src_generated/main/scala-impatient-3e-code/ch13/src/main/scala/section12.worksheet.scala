package scala$minusimpatient$minus3e$minuscode.ch13.src.main.scala


final class section12$u002Eworksheet$_ {
def args = section12$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch13/src/main/scala/section12.worksheet.sc"""
/*<script>*/
import scala.io.*
var logString = ""
def log(x: Any) = logString = logString + x + " "

def numsFrom(n: BigInt): LazyList[BigInt] = { log(n) ; n } #:: numsFrom(n + 1)
val tenOrMore = numsFrom(10)
logString
tenOrMore.tail.tail.tail.head
logString
tenOrMore.tail.tail.tail.head
logString
val squares = numsFrom(1).map(x => x * x)
logString
squares.take(5).force
logString
val words = Source.fromFile("/usr/share/dict/words").getLines.to(LazyList)
words(0)
words(1)
words(0) // Cached
val palindromicSquares = (1 to 1000000).view
  .map(x => x * x)
  .filter(x => x.toString == x.toString.reverse)
palindromicSquares.take(10).mkString(",")

/*</script>*/ /*<generated>*//*</generated>*/
}

object section12$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section12$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section12$u002Eworksheet_sc.script as `section12.worksheet`

