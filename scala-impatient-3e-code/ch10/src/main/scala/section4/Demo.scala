package section4

// Traits for rich interfaces

trait Logger :
  def log(msg: String) : Unit
  def info(msg: String) = log(s"INFO: $msg") 
  def warn(msg: String) = log(s"WARN: $msg") 
  def severe(msg: String) = log(s"SEVERE: $msg")

trait ConsoleLogger extends Logger :
  def log(msg: String) = println(msg)

class Account :
  protected var balance = 0.0

class ConsoleLoggedAccount extends Account, ConsoleLogger :  
  def withdraw(amount: Double) =
    if amount > balance then severe("Insufficient funds")
    else balance -= amount
  
@main def demo = 
  val acct = ConsoleLoggedAccount() 
  acct.withdraw(100)
