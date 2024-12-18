package scala$minusimpatient$minus3e$minuscode.ch14.src.main.scala


final class section5$u002Eworksheet$_ {
def args = section5$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch14/src/main/scala/section5.worksheet.sc"""
/*<script>*/
// This is an immutable array
val smallPrimes = IArray(2, 3, 5, 7, 11, 13, 17, 19)

// If the following were to compile, it would mutate the array

/*

smallPrimes match
  case a: Array[Int] => a(1) = 4

*/

// When working with variables of type Any, you may need to cast to Matchable

class Bounded(var value: Int, to: Int) :
  override def equals(other: Any) = 
    other.asInstanceOf[Matchable] match
      case that: Bounded => value == that.value && to == that.to
      case _ => false

// Why the fuss? Consider these opaque types

opaque type Minute = Bounded
def Minute(m: Int) = Bounded(m, 60)

opaque type Second = Bounded
def Second(m: Int) = Bounded(m, 60)

// The following compare as equal, but surely they shouldn't

Minute(10) == Second(10)

// Fix: 
// import scala.language.strictEquality

/*</script>*/ /*<generated>*//*</generated>*/
}

object section5$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section5$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section5$u002Eworksheet_sc.script as `section5.worksheet`

