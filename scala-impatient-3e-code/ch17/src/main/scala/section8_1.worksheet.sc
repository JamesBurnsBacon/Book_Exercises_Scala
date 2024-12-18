class Person(name: String) :
  override def toString = s"Person $name"
class Student(name: String, major: String) extends Person(name) :
  override def toString = s"Student $name majoring in $major"

// This type is covariant. See what happens if you remove the +
class Pair[+T](val first: T, val second: T)

def makeFriends(p: Pair[Person]) = s"$first and $second are now friends"

val fred = Student("Fred", "Marketing")
val wilma = Student("Wilma", "CS")
val p = Pair(fred, wilma)

makeFriends(p)
