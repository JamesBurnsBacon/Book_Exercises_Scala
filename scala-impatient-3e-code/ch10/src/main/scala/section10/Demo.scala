package section10

import java.io.*

// Trait construction order

trait Logger :
  println("Constructing Logger")
  def log(msg: String): Unit

trait FileLogger extends Logger :
  println("Constructing FileLogger") // Constructor code
  private val out = PrintWriter("/tmp/log.txt") // Constructor code
  def log(msg: String) =
    out.println(msg)
    out.flush()

trait ShortLogger extends Logger :
  println("Constructing ShortLogger")

  val maxLength: Int // An abstract field
  abstract override def log(msg: String) =
    super.log(
      if msg.length <= maxLength then msg
      else s"${msg.substring(0, maxLength - 1)}…")

class Account :
  protected var balance = 0.0
  println("Constructing Account")

abstract class LoggedAccount extends Account, Logger :
  println("Constructing LoggedAccount")
  def withdraw(amount: Double) =
    if (amount > balance) log("Insufficient funds")
    else balance -= amount  
  // More methods ...

class ShortLoggedAccount extends LoggedAccount, FileLogger, ShortLogger :
  println("Constructing ShortLoggedAccount")
  val maxLength = 20

@main def demo =
  val acct = ShortLoggedAccount()
  println("Construction finished")
