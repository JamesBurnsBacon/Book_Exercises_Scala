package section5

import java.nio.file.*

// Objects with traits

trait Logger :
  def log(msg: String): Unit

class Account :
  protected var balance = 0.0

abstract class LoggedAccount extends Account, Logger :
  def withdraw(amount: Double) =
    if amount > balance then log("Insufficient funds")
    else balance -= amount

trait ConsoleLogger extends Logger : 
  def log(msg: String) = println(msg)

trait FileLogger extends Logger :
  def log(msg: String) = Files.writeString(Path.of("/tmp/log.txt"), msg + "\n", StandardOpenOption.APPEND)

@main def demo = 
  val acct = new LoggedAccount() with ConsoleLogger
  val acct2 = new LoggedAccount() with FileLogger
  acct.withdraw(100)
  acct2.withdraw(100)
