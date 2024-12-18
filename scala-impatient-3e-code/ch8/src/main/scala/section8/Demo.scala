package section8

class Person(val name: String) :
  override def toString = s"${getClass.getName}[name=$name]"

class SecretAgent(codename: String) extends Person(codename) :
  override val name = "secret" // Don't want to reveal name
  override val toString = "secret" // 

abstract class User : 
  def id: Int // Each user has an ID that is computed in some way

class Student(override val id: Int) extends User 
  // A student ID is simply provided in the constructor

@main def demo = 
  val fred = Person("Fred")
  println(fred.name)
  val james = SecretAgent("007")
  println(james.name)
  
  val u: User = Student(1729)
  println(u.id)
