package scala$minusimpatient$minus3e$minuscode.ch12.src.main.scala


final class section9$u002Eworksheet$_ {
def args = section9$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch12/src/main/scala/section9.worksheet.sc"""
/*<script>*/
// Methods for composing, currying, and tupling

// Composing

val sqrt = scala.math.sqrt
val fabs: Double => Double = scala.math.abs // Need the type because abs is overloaded
val f = sqrt compose fabs // Infix notation; could also write sqrt.compose(fabs)
f(-9) // Yields sqrt(fabs(-9)) or 3
val g = fabs andThen sqrt // The same as sqrt compose fabs
g(-9)

// Currying

val fmax : (Double, Double) => Double = scala.math.max
  // Need the type because max is overloaded
fmax.curried // Has type Double => Double => Double
val h = fmax.curried(0)
h(-9)

// Tupling

val k = mul.tupled // Has type ((Int, Int)) => Int
val xs = Array(1, 7, 2, 9)
val ys = Array(1000, 100, 10, 1)
xs.zip(ys).map(mul.tupled) // Yields Array(1000, 700, 20, 9)
xs.zip(ys).map(_ * _) // The tuple components are passed to the function

/*</script>*/ /*<generated>*//*</generated>*/
}

object section9$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section9$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section9$u002Eworksheet_sc.script as `section9.worksheet`

