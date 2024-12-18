package scala$minusimpatient$minus3e$minuscode.ch14.src.main.scala


final class section6$u002Eworksheet$_ {
def args = section6$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch14/src/main/scala/section6.worksheet.sc"""
/*<script>*/
// Matching with arrays

val arr = Array(0, 1, 2)
arr match
  case Array(0) => "0"
  case Array(x, y) => s"$x $y"
  case Array(0, _*) => "0 ..."
  case _ => "something else"

// Use * to bind remainder

arr match
  case Array(0, rest*) => rest.min
  case _ => 0

// Matching with lists

val lst = List(0, 1)
lst match
  case 0 :: Nil => "0"
  case x :: y :: Nil => s"$x $y"
  case 0 :: tail => "0 ..."
  case _ => "something else"

// Matching with tuples

val pair = (0, 1)
pair match
  case (0, _) => "0 ..."
  case (y, 0) => s"$y 0"
  case _ => "neither is 0"

// Matching head and tail

val longerTuple = (0, 0.0, "zero", scala.math.BigInt(0), None, EmptyTuple, null)
longerTuple match
  case h *: t => s"head is $h, tail is $t"
  case _: EmptyTuple => "empty"

// Can have alternatives

pair match
  case (_, 0) | (0, _) => "one zero" // OK, matches if one component is zero
  case _ => "no zeroes"

// But not with variables

/*

pair match
  case (x, 0) | (0, x) => s"one zero, the other $x" // Error—cannot bind with alternatives
  case _ => "no zeroes"

*/

/*</script>*/ /*<generated>*//*</generated>*/
}

object section6$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section6$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section6$u002Eworksheet_sc.script as `section6.worksheet`

