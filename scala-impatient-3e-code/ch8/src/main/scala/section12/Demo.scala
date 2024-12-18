package section12

class Account(var balance: Double)

class Person(val name: String) :
  def description: String = ???

@main def demo = 
  val account = new Account(1000.0)
  val amount = 100.0
  account.synchronized { account.balance += amount }
  println(account.balance)

  val p = Person("Wilma")
  println(p.description)

  def showAny(o: Any) = println(s"${o.getClass.getName}: $o") 
  def showUnit(o: Unit) = println(s"${o.getClass.getName}: $o") 
  showAny("Hello") // Yields "java.lang.String: Hello" 
  showUnit("Hello") // Yields "void: ()"
    // "Hello" is replaced with () (with a warning)
