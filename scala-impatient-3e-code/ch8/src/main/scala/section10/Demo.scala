package section10
class Employee(name: String, age: Int, protected var salary: Double) :
  override def toString = s"${getClass.getName}[name=${name},age=${age},salary=${salary}]"

class Manager(name: String, age: Int, salary: Double)
    extends Employee(name, age, salary) :
  def setSalary(newSalary: Double) = // A manager's salary can never decrease
    if (newSalary > salary) salary = newSalary 

  def outranks(other: Manager) =
    salary > other.salary
    // This does not work because age isn't protected
    // age > other.age

@main def demo = 
  val manager1 = Manager("Fred", 42, 100000)
  val manager2 = Manager("Wilma", 39, 120000)

  // This does not work because the protected field is not accessible
  // in the package (unlike in Java)
  // manager1.salary = 110000
  manager1.setSalary(110000)
  manager2.setSalary(90000)

  println(manager2)
  println(manager2.outranks(manager1))
