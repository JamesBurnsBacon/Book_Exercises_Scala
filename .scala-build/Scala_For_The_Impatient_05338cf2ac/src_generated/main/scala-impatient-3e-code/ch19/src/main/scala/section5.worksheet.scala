package scala$minusimpatient$minus3e$minuscode.ch19.src.main.scala


final class section5$u002Eworksheet$_ {
def args = section5$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch19/src/main/scala/section5.worksheet.sc"""
/*<script>*/
import java.text.NumberFormat
import java.util.Comparator
import java.util.Locale

case class QuoteDelimiters(left: String, right: String)

// An object with given values

object French :
  given quoteDelims: QuoteDelimiters = QuoteDelimiters("«", "»")
  given NumberFormat = NumberFormat.getNumberInstance(Locale.FRANCE)

// Importing by name or type
{
  import French.quoteDelims // imported by name
  import French.given NumberFormat // imported by type
  (summon[QuoteDelimiters], summon[NumberFormat].format(3.14))
}

// Importing multiple givens
{
  import French.{quoteDelims, given NumberFormat}
  (summon[QuoteDelimiters], summon[NumberFormat].format(3.14))
}

// An object with given Comparator instances

object Comparators :
  def ≤[T : Comparator](x: T, y: T) = summon[Comparator[T]].compare(x, y) <= 0
  given Comparator[Int] with
    def compare(x: Int, y: Int) = Integer.compare(x, y)
  given [T <: Comparable[T]] : Comparator[T] with
    def compare(x: T, y: T) = x.compareTo(y)
  given [T : Comparator] : Comparator[List[T]] with
    def compare(xs: List[T], ys: List[T]) =
      if xs.isEmpty && ys.isEmpty then 0
      else if xs.isEmpty then -1
      else if ys.isEmpty then 1
      else
        val diff = summon[Comparator[T]].compare(xs.head, ys.head)
        if diff != 0 then diff
        else compare(xs.tail, ys.tail)
  // Not a given
  def compare[T : Comparator](x: T, y: T) = summon[Comparator[T]].compare(x, y)
  // Another given that isn't Comparable
  given QuoteDelimiters("≤", "≥") 

// Importing all parameterized instances
{
  import Comparators.given Comparator[?]
  (summon[Comparator[Int]].compare(1, -2), summon[Comparator[String]].compare("Hello", "World"))
}

// Importing all given values
{
  import Comparators.given
  summon[QuoteDelimiters]
}

// The wildcard does NOT import given values
{
  import Comparators.*
  // compare(1, 2) // compare is imported, but not Comparator[Int]
}

// Here is how to import everything
{
  import Comparators.{*, given}
  compare(1, 2)
}

/*</script>*/ /*<generated>*//*</generated>*/
}

object section5$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section5$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section5$u002Eworksheet_sc.script as `section5.worksheet`

