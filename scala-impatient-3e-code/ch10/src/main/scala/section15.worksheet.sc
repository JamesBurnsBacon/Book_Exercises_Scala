// Self types

trait Logger :
  def log(msg: String): Unit

trait ConsoleLogger extends Logger :
  def log(msg: String) = println(msg)


// This trait can only be mixed into an Exception subclass

trait LoggedException extends Logger :
  this: Exception =>
    def log(): Unit = log(getMessage())  
      // OK to call getMessage because this is an Exception

class Account :
  protected var balance = 0.0

class SavingsAccount extends Account :
  def withdraw(amount: Double) =
    if (amount > balance) throw 
      new IllegalStateException("Insufficient funds") 
        with LoggingException with ConsoleLogger
    else balance -= amount

try 
  val acct = new SavingsAccount
  acct.withdraw(100)
catch
  case e: LoggingException => e.log()

// This does not work
// val f = new Account() with LoggedException
  // Error: Account isn't a subtype of Exception, the self type of LoggedException

// Caution: Self types do not inherit
// trait MonitoredException extends LoggedException

// You need to repeat the self type
trait MonitoredException extends LoggedException { 
  this: Exception =>
