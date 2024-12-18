package section2

class Person :
  var name = ""
  override def toString = s"${getClass.getName}[name=$name]"

class Employee extends Person :
  var salary = 0.0
  override def toString = s"${super.toString}[salary=$salary]"

@main def demo =
  val fred = Employee()
  fred.name = "Fred"
  fred.salary = 50000
  println(fred)
