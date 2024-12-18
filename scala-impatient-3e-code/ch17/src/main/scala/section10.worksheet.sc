// A simple List type
abstract sealed class List[+T] :
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def toString = if isEmpty then "" else s"$head $tail" 

case class NonEmpty[T](head: T, tail: List[T]) extends List[T] :
  def isEmpty = false

case class Empty[T] extends List[T] :
  def isEmpty = true
  def head = throw UnsupportedOperationException()
  def tail = throw UnsupportedOperationException()

// Try changing the declaration of Empty to an object:
// case object Empty[T] extends List[T] : // Error

// Remedy: 
// case object Empty extends List[Nothing] :

// Now you can construct a list:
// val lst = NonEmpty(42, Empty)
