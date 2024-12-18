@main def test =
  println("Without macros")
  import scala.compiletime.*
  inline def debug1(inline expr: Any): Unit = println(codeOf(expr) + " = " + expr)

  val x = 6
  val y = 7
  debug1(x * y) // Prints x.*(y) = 42

  println("The debug1 macro")

  Debug.debug1(x * y)
  Debug.debug1(x + "*" + y)

  println("The debugN macro")
  import Debug.debugN

  debugN("Test description", x, y, x * y)

  println("StringMatching")

  val decimal: StringMatching["[0-9]+"] = "1729"
  println(decimal)

  // This does not compile:
  // val octal: StringMatching["[0-7]+"] = "1729"
