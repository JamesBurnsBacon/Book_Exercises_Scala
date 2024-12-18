// The replaceFirst method with a lower bound

class Pair[T](val first: T, val second: T) :
  override def toString = s"($first, $second)"
  def replaceFirst[R >: T](newFirst: R) = Pair[R](newFirst, second)
  // or def replaceFirst[R >: T](newFirst: R) = Pair(newFirst, second)
  // CAUTION: This method returns a Pair[Any]
  // def replaceFirst[R](newFirst: R) = Pair(newFirst, second)

class Person(name: String) :
  override def toString = s"Person $name"
class Student(name: String, major: String) extends Person(name) :
  override def toString = s"Student $name majoring in $major"

val s1 = Student("Fred", "Marketing")
val s2 = Student("Wilma", "CS")
val p = Pair(s1, s2)
p.replaceFirst(Person("Barney"))
