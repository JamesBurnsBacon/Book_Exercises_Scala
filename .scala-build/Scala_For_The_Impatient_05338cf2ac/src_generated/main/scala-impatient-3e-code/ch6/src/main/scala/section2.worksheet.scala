package scala$minusimpatient$minus3e$minuscode.ch6.src.main.scala


final class section2$u002Eworksheet$_ {
def args = section2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch6/src/main/scala/section2.worksheet.sc"""
/*<script>*/
class Account :
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double) =
    balance += amount 
  def description = "Account " + id + " with balance " + balance

object Account : // The companion object
  private var lastNumber = 0
  private def newUniqueNumber() =
    lastNumber += 1
    lastNumber

val acct1 = new Account
val acct2 = new Account
acct1.deposit(1000)
val d1 = acct1.description
val d2 = acct2.description

/*</script>*/ /*<generated>*//*</generated>*/
}

object section2$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section2$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section2$u002Eworksheet_sc.script as `section2.worksheet`

