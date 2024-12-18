package scala$minusimpatient$minus3e$minuscode.ch17.src.main.scala


final class section1$u002Eworksheet$_ {
def args = section1$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch17/src/main/scala/section1.worksheet.sc"""
/*<script>*/
// A generic class with two type parameters
class Pair[T, S](val first: T, val second: S)
// The type parameters are inferred
val p = Pair(42, "String") // It's a Pair[Int, String]
// You can specify the type parameters explicitly
val p2 = Pair[Any, Any](42, "String")
// This type is shown in infix notation
import scala.annotation.*
@showAsInfix class x[T, U](val first: T, val second: U)
val p3 = x(42, "String")

/*</script>*/ /*<generated>*//*</generated>*/
}

object section1$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section1$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section1$u002Eworksheet_sc.script as `section1.worksheet`

