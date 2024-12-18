package scala$minusimpatient$minus3e$minuscode.ch14.src.main.scala


final class section13$u002Eworksheet$_ {
def args = section13$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch14/src/main/scala/section13.worksheet.sc"""
/*<script>*/
// A parameterized enumeration

enum Amount :
  case Dollar(value: Double)
  case Currency(value: Double, unit: String)
  case Nothing

// A companion object

object Amount :
  def euros(value: Double) = if value == 0 then Nothing else Currency(value, "EUR")

// Option could have been defined as a parameterized enumeration with a type parameter

import java.util.NoSuchElementException

enum Option[+T] :
  case Some(value: T)
  case None

  def get = this match
    case Some(v) => v
    case None => throw NoSuchElementException()

// You can override the variance annotations in the case classes

enum Producer[-T] :
  case Constant[U](value: U) extends Producer[U]
  case Generator[U](next: () => U) extends Producer[U]

/*</script>*/ /*<generated>*//*</generated>*/
}

object section13$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section13$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section13$u002Eworksheet_sc.script as `section13.worksheet`

