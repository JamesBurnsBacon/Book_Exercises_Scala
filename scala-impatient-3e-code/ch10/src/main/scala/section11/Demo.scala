package section11

import java.io.*

// Trait constructors with parameters

trait Logger :
  def log(msg: String): Unit

class Account :
  protected var balance = 0.0

abstract class LoggedAccount extends Account, Logger :
  def withdraw(amount: Double) =
    if (amount > balance) log("Insufficient funds")
    else balance -= amount  
  // More methods ...

trait FileLogger(filename: String) extends Logger :
  private val out = PrintWriter(filename)
  def log(msg: String) =
    out.println(msg)
    out.flush()

/* 
// This code is illegal--no construction parameter for FileLogger
class FileLoggedAccount extends LoggedAccount, FileLogger
  // Error—no arguments for FileLogger constructor
*/

/* 
// This code is illegal--conflicting constructor parameters
class TmpLoggedAccount extends Account, FileLogger("/tmp/log.txt")
class FileLoggedAccount(filename) extends TmpLoggedAccount, FileLogger(filename)
  // Error—FileLogger already initialized
*/

/* 
// This code is illegal--trait cannot call constructor of other trait
trait TimestampFileLogger extends FileLogger("/tmp/log.txt") :
  // Error—a trait cannot call the constructor of another trait
*/

trait TimestampFileLogger extends FileLogger :
  override def log(msg: String) = super.log(s"${java.time.Instant.now()} $msg")

@main def demo = 
  val acct = new LoggedAccount() with FileLogger("/tmp/log.txt")
  acct.withdraw(500)
  val acct2 = new LoggedAccount() with TimestampFileLogger with FileLogger("/tmp/log.txt")
  acct2.withdraw(500)
