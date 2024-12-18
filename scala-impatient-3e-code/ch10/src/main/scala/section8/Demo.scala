package section8

// Concrete fields in traits

trait Logger :
  def log(msg: String): Unit

trait ConsoleLogger extends Logger :
  def log(msg: String) = println(msg)

trait ShortLogger extends Logger :
  val maxLength = 15 // A concrete field
  abstract override def log(msg: String) =
    super.log(
      if msg.length <= maxLength then msg
      else s"${msg.substring(0, maxLength - 1)}…")

class Account :
  protected var balance = 0.0
  
class SavingsAccount extends Account, ConsoleLogger, ShortLogger :
  var interest = 0.0
    def withdraw(amount: Double) =
    if (amount > balance) log("Insufficient funds")
    else balance -= amount  
  // More methods ...

def printDeclaredFields(cl: Class[?]) =
  println(s"${cl.getName} declared fields")  
  println(cl.getDeclaredFields.map(_.toString).mkString("\n"))

@main def demo = 
  printDeclaredFields(classOf[Account])
  printDeclaredFields(classOf[SavingsAccount])
