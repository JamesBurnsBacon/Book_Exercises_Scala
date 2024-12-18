package section6

abstract class Person(val name: String) :
  def id: Int // No method body—this is an abstract method
  override def toString = s"${getClass.getName} with name ${name} and id ${id}"

class Employee(name: String) extends Person(name) :
  def id = name.hashCode // override keyword not required

@main def demo =
  val e = Employee("Harry")
  println(e)
