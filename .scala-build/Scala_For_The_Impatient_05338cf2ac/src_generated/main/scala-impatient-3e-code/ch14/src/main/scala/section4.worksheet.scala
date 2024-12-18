package scala$minusimpatient$minus3e$minuscode.ch14.src.main.scala


final class section4$u002Eworksheet$_ {
def args = section4$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch14/src/main/scala/section4.worksheet.sc"""
/*<script>*/
// Match on type

for obj <- Array(42, "42", BigInt("42"), System.out) yield
  obj match
    case x: Int => x
    case s: String => Integer.parseInt(s)
    case _: BigInt => Int.MaxValue
    case _ => 0

// Caution: Must have variable with type match

for obj <- Array(BigInt("42"), BigInt) yield
  obj match
    case _: BigInt => Int.MaxValue // Matches any object of type BigInt
    case BigInt => -1 // Matches the BigInt object of type Class

// Caution: Can't match type parameters (except for Array)

for obj <- Array(Map("Alice" -> 42), Array(13, 29), Array(42.0)) yield
  obj match
    // case m: Map[String, Int] => s"a map String -> Int" // Don't
    case m: Map[_, _] => s"a map of size ${m.size}" // OK
    case a: Array[Int] => s"an array of Int with sum ${a.sum}"
    case _ => "something else"

// The following match has an unreachable clause and won't compile 

val ex = NullPointerException()

/*

ex match
  case _: RuntimeException => "RTE"
  case _: NullPointerException => "NPE" // Error: unreachable case
  case _: IOException => "IOE"
  case _: Throwable => ""

*/

// The following match also has an unreachable case null clause

val obj: AnyRef = null

/*

obj match
  case s: String => Double.parseDouble(s)
  case null => Double.NaN

*/

/*</script>*/ /*<generated>*//*</generated>*/
}

object section4$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section4$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section4$u002Eworksheet_sc.script as `section4.worksheet`

