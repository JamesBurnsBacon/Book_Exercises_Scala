package section9

// Abstract fields in traits

trait Logger :
  def log(msg: String): Unit

trait ConsoleLogger extends Logger :
  def log(msg: String) = println(msg)

class Account :
  protected var balance = 0.0

abstract class LoggedAccount extends Account, Logger :
  def withdraw(amount: Double) =
    if amount > balance then log("Insufficient funds")
    else balance -= amount  
  // More methods ...

trait ShortLogger extends Logger :
  val maxLength: Int // An abstract field
  abstract override def log(msg: String) = 
    super.log(
      if msg.length <= maxLength then msg
      else s"${msg.substring(0, maxLength - 1)}…")
        // The maxLength field is used in the implementation

class ShortLoggedAccount extends LoggedAccount, ConsoleLogger, ShortLogger :
  val maxLength = 20 // No override necessary
@main def demo = 
  val acct1 = ShortLoggedAccount()
  acct1.withdraw(500)
  val acct = new LoggedAccount() with ConsoleLogger with ShortLogger :
    val maxLength = 15
  acct.withdraw(500)
