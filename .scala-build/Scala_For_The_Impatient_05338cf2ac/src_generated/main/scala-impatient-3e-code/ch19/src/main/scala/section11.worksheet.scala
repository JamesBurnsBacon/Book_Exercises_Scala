package scala$minusimpatient$minus3e$minuscode.ch19.src.main.scala


final class section11$u002Eworksheet$_ {
def args = section11$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch19/src/main/scala/section11.worksheet.sc"""
/*<script>*/
import scala.language.implicitConversions

// This is how the <:< "subtype evidence" operator is implemented:

abstract class <:<[-From, +To] extends Conversion[From, To]

object `<:<` :
  given conforms[A]: (A <:< A) with
    def apply(x: A) = x

// Typical usage:

def firstLast[A, C](it: C)(using ev: C <:< Iterable[A]) : (A, A) = 
  (it.head, it.last)

firstLast(0 until 10) // the pair (0, 9)

// This evidence can be summoned:
given ts[T](using T <:< Comparable[? >: T]): java.util.Set[T] = java.util.TreeSet[T]()
given hs[T](using NotGiven[T <:< Comparable[? >: T]]): java.util.Set[T] = java.util.HashSet[T]()

// This one can't
// summon[Iterable[Int] <:< Range]

/*</script>*/ /*<generated>*//*</generated>*/
}

object section11$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section11$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section11$u002Eworksheet_sc.script as `section11.worksheet`

