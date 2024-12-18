// Arrays are not covariant
/*
val students = Array[Student](length)
val people: Array[Person] = students // Not legal, but suppose it was*/

// Arrays are not contravariant either
/*
val people = Array[Person](length)
val students: Array[Student] = people // Not legal, but suppose it was*/

// Defining a covariant mutable pair doesn't work
/*
class Pair[+T](var first: T, var second: T) // Error
*/

// This method is safe, but it violates the variance position rule
/*
class Pair[+T](val first: T, val second: T) :
  def replaceFirst(newFirst: T) = Pair[T](newFirst, second) // Error
*/

// Remedy: Add a type parameter
class Pair[+T](val first: T, val second: T) :
  override def toString = s"($first, $second)"
  def replaceFirst[R >: T](newFirst: R) = Pair[R](newFirst, second)

val p = Pair("Fred", "Brooks")
p.replaceFirst("Wilma")
