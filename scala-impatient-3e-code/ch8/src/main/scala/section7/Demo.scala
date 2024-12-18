package section7

abstract class Person :
  val id: Int 
    // No initializer—this is an abstract field with an abstract getter method
  var name: String 
    // Another abstract field, with abstract getter and setter methods
  override def toString = s"${getClass.getName} with name ${name} and id ${id}"

class Employee(val id: Int) extends Person : // Subclass has concrete id property
  var name = "" // and concrete name property

@main def demo =
  val wilma = Employee(1728)
  wilma.name = "Wilma"
  println(wilma)

  val fred = new Person() {
    val id = 1729
    var name = "Fred"
  }
  println(fred)
