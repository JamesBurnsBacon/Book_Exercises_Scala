package section12

import java.io.*

// Traits extending classes

trait Logger :
  def log(msg: String): Unit

trait ConsoleLogger extends Logger :
  def log(msg: String) = println(msg)

trait LoggedException extends Exception, ConsoleLogger :
  override def log(msg: String) = super.log(s"${getMessage()} $msg")

class UnhappyException extends LoggedException : // This class extends a trait
  override def getMessage() = "arggh!"

class UnhappyIOException extends IOException, LoggedException

/*
// This code is illegal--a class can't have two superclasses

class UnhappyFrame extends javax.swing.JFrame, LoggedException 
  // Error: Unrelated superclasses
*/

class Account :
  protected var balance = 0.0

class CheckedAccount extends Account :
  def withdraw(amount: Double) =
    if amount > balance then throw 
      new IllegalStateException("Insufficient funds") 
        with LoggedException with ConsoleLogger
    else balance -= amount
  // More methods ...

@main def demo =
  try 
    val acct = CheckedAccount()
    acct.withdraw(100)
  catch 
    case e: LoggedException => e.log("exception caught")
