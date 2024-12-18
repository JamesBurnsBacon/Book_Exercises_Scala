package section7

// Overriding abstract methods in traits

trait Logger :
  def log(msg: String) : Unit // This method is abstract

/* 
   
// This trait does not compile
trait TimestampLogger extends Logger : 
  override def log(msg: String) = // Overrides an abstract method
    super.log(s"${java.time.Instant.now()} $msg") // Is super.log defined?

*/

// Declare log as abstract:

trait TimestampLogger extends Logger : 
  abstract override def log(msg: String) =
    super.log(s"${java.time.Instant.now()} $msg")

// Still need to mix in a concrete logger

trait ConsoleLogger extends Logger :
  override def log(msg: String) = println(msg) 

class Account :
  protected var balance = 0.0

abstract class LoggedAccount extends Account, Logger :
  def withdraw(amount: Double) =
    if (amount > balance) log("Insufficient funds")
    else balance -= amount  
  // More methods ...

@main def demo = 
  val acct = new LoggedAccount() with ConsoleLogger 
  acct.withdraw(100)
