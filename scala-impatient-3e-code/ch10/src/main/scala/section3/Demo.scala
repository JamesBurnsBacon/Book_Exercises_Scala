package section3

// Traits with concrete methods

trait Logger :
  def log(msg: String): Unit

trait ConsoleLogger extends Logger :
  def log(msg: String) = println(msg)

class Account :
  protected var balance = 0.0

class ConsoleLoggedAccount extends Account, ConsoleLogger :
  def withdraw(amount: Double) =
    if amount > balance then log("Insufficient funds")
    else balance -= amount  
  // More methods ...

@main def demo =
  val acct = ConsoleLoggedAccount()
  acct.withdraw(100)
