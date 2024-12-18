package section6

// Layered traits

trait Logger :
  def log(msg: String): Unit

trait ConsoleLogger extends Logger :
  def log(msg: String) = println(msg)

class Account :
  protected var balance = 0.0

abstract class LoggedAccount extends Account, Logger :
  def withdraw(amount: Double) =
    if (amount > balance) log("Insufficient funds")
    else balance -= amount  
  // More methods ...

trait TimestampLogger extends ConsoleLogger :
  override def log(msg: String) =
    super.log(s"${java.time.Instant.now()} $msg")

trait ShortLogger extends ConsoleLogger :
  override def log(msg: String) =
    super.log(
      if msg.length <= 15 then msg
      else s"${msg.substring(0, 14)}…")

@main def demo = 
  val acct1 = new LoggedAccount() with TimestampLogger with ShortLogger
  val acct2 = new LoggedAccount() with ShortLogger with TimestampLogger
  acct1.withdraw(100) 
  acct2.withdraw(100)
