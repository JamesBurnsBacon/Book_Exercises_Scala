package scala$minusimpatient$minus3e$minuscode.ch19.src.main.scala


final class section3$u002Eworksheet$_ {
def args = section3$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch19/src/main/scala/section3.worksheet.sc"""
/*<script>*/
case class QuoteDelimiters(left: String, right: String)

// This is the explicit form that you already saw
{
  given englishQuoteDelims : QuoteDelimiters = QuoteDelimiters("“", "”")
  summon[QuoteDelimiters]  
}

// There is no type inference for given. This is an error
{
  // given englishQuoteDelims = QuoteDelimiters("“", "”") // Error—no type inference
}

// With a constructor, you can omit the type and =
{
  given englishQuoteDelims : QuoteDelimiters("“", "”")
  summon[QuoteDelimiters]  
}

// You can omit the name
{
  given QuoteDelimiters("“", "”")
  summon[QuoteDelimiters]  
}

// In an abstract class or trait, given instances can be abstract
{
  trait Logger :
    def log(msg: String) : Unit
  
  abstract class Service :
    given logger: Logger
    type Request
    type Response
    def get(r: Request): Response

  class ConsoleLogger extends Logger : 
    def log(msg: String) = println(msg) 

  class QuoteService extends Service :
    type Request = Unit
    type Response = String
    private var logs = ""
    given logger: Logger = new Logger :
      def log(msg: String) = logs += msg + "\n"
    def get(r: Request): Response = 
      val response = scala.io.Source.fromURL("https://horstmann.com/random/quote", "UTF-8").mkString
      summon[Logger].log(s"response: $response")
      response
    def showLogs = logs

  val qs = QuoteService()
  qs.get(())
  qs.showLogs
}

import java.util.Comparator

// A given instance that overrides an abstract method
{
  given intComp: Comparator[Int] =
    new Comparator[Int]() :
      def compare(x: Int, y: Int) = Integer.compare(x, y)
  summon[Comparator[Int]].compare(3, -4)
}

// Convenient shortcut
{
  given intComp: Comparator[Int] with
    def compare(x: Int, y: Int) = Integer.compare(x, y)
  summon[Comparator[Int]].compare(3, -4)
}

// You can omit the name
given Comparator[Int] with
  def compare(x: Int, y: Int) = Integer.compare(x, y)
summon[Comparator[Int]].compare(3, -4)

{
  given englishQuoteDelims : QuoteDelimiters = QuoteDelimiters("“", "”")

  // You can summon a given instance. But will it come?
  val delim = summon[QuoteDelimiters]
}

// Here, summoning fails
// val delim2 = summon[QuoteDelimiters]

// Given instances can be parameterized
given comparableComp[T <: Comparable[T]] : Comparator[T] with
    def compare(x: T, y: T) = x.compareTo(y)
import java.nio.file.Path
summon[Comparator[Path]].compare(Path.of("/usr/share"), Path.of("/home"))


// A given instance with a using parameter
given listComp[T](using tcomp: Comparator[T]) : Comparator[List[T]] =
  new Comparator[List[T]]() :
    def compare(xs: List[T], ys: List[T]) =
      if xs.isEmpty && ys.isEmpty then 0
      else if xs.isEmpty then -1
      else if ys.isEmpty then 1
      else
        val diff = tcomp.compare(xs.head, ys.head)
        if diff != 0 then diff
        else compare(xs.tail, ys.tail)
summon[Comparator[List[Int]]].compare(List(2, 3), List(1, 2, 3))

// In this case, you can use a context bound
// Note that you need to summon the comparator
{
  given [T](using tcomp: Comparator[T]) : Comparator[List[T]] with
    def compare(xs: List[T], ys: List[T]) =
      if xs.isEmpty && ys.isEmpty then 0
      else if xs.isEmpty then -1
      else if ys.isEmpty then 1
      else
        val ev = summon[Comparator[T]]
        val diff = ev.compare(xs.head, ys.head)
        if diff != 0 then diff
        else compare(xs.tail, ys.tail)    

  summon[Comparator[List[Int]]].compare(List(2, 3), List(1, 2, 3))
}
  
// This generic function works for all T with a given Comparator[T]
def max[T](a: Array[T])(using comp: Comparator[T]) =
  if a.length == 0 then None
  else
    var m = a(0)
    for i <- 1 until a.length do
      if comp.compare(a(i), m) > 0 then m = a(i)
    Some(m)

max(Array(List(2, 3), List(1, 2, 3), List(4)))

/*</script>*/ /*<generated>*//*</generated>*/
}

object section3$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section3$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section3$u002Eworksheet_sc.script as `section3.worksheet`

