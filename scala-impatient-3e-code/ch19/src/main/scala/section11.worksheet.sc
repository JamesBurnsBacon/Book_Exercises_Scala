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
