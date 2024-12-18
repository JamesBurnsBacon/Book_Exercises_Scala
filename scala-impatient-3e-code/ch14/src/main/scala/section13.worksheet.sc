// A parameterized enumeration

enum Amount :
  case Dollar(value: Double)
  case Currency(value: Double, unit: String)
  case Nothing

// A companion object

object Amount :
  def euros(value: Double) = if value == 0 then Nothing else Currency(value, "EUR")

// Option could have been defined as a parameterized enumeration with a type parameter

import java.util.NoSuchElementException

enum Option[+T] :
  case Some(value: T)
  case None

  def get = this match
    case Some(v) => v
    case None => throw NoSuchElementException()

// You can override the variance annotations in the case classes

enum Producer[-T] :
  case Constant[U](value: U) extends Producer[U]
  case Generator[U](next: () => U) extends Producer[U]
