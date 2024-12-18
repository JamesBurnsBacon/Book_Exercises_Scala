package section1

class Person :
  var name = ""

class Employee extends Person :
  var salary = 0.0
  def description = "An employee with name " + name + " and salary " + salary

@main def demo =
  val fred = Employee()
  fred.name = "Fred"
  fred.salary = 50000
  println(fred.description)
