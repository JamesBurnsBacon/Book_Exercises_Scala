// This is an immutable array
val smallPrimes = IArray(2, 3, 5, 7, 11, 13, 17, 19)

// If the following were to compile, it would mutate the array

/*

smallPrimes match
  case a: Array[Int] => a(1) = 4

*/

// When working with variables of type Any, you may need to cast to Matchable

class Bounded(var value: Int, to: Int) :
  override def equals(other: Any) = 
    other.asInstanceOf[Matchable] match
      case that: Bounded => value == that.value && to == that.to
      case _ => false

// Why the fuss? Consider these opaque types

opaque type Minute = Bounded
def Minute(m: Int) = Bounded(m, 60)

opaque type Second = Bounded
def Second(m: Int) = Bounded(m, 60)

// The following compare as equal, but surely they shouldn't

Minute(10) == Second(10)

// Fix: 
// import scala.language.strictEquality
