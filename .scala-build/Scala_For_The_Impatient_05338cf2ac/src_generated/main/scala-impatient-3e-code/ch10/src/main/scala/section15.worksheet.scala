package scala$minusimpatient$minus3e$minuscode.ch10.src.main.scala


final class section15$u002Eworksheet$_ {
def args = section15$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch10/src/main/scala/section15.worksheet.sc"""
/*<script>*/
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

/*</script>*/ /*<generated>*//*</generated>*/
}

object section15$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section15$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section15$u002Eworksheet_sc.script as `section15.worksheet`

