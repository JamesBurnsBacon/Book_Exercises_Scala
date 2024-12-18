package section3

class Person :
  var name = ""
  override def toString = getClass.getName + "[name=" + name + "]"

class Employee extends Person :
  var salary = 0.0
  override def toString = super.toString + "[salary=" + salary + "]"

class Manager extends Employee

@main def demo = 
  val r = scala.math.random()
  val p = if (r < 0.33) new Person 
    else if (r < 0.67) new Employee 
    else new Manager  
  println(p)
  if p.isInstanceOf[Employee] then
    val s = p.asInstanceOf[Employee] // s has type Employee
    println("It's some kind of employee.")
    s.salary = 50000
  if p.getClass == classOf[Employee] then println("It's an Employee instance")

  p match 
    case s: Employee => println("Yup, an employee") // Process s as an Employee 
    case _ => println("Nope, something else") // p wasn't an Employee
