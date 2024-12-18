// Anonymous functions

(x: Double) => 3 * x
val triple = (x: Double) => 3 * x
  // just like def triple(x: Double) = 3 * x
Array(3.14, 1.42, 2.0).map((x: Double) => 3 * x)
  // Array(9.42, 4.26, 6.0)
// Can also use braces
Array(3.14, 1.42, 2.0).map{ (x: Double) => 3 * x }
// More common with infix notation
Array(3.14, 1.42, 2.0) map { (x: Double) => 3 * x }

// No "eta expansion" when parameterless
def heads() = scala.math.random() < 0.5
heads _
heads()
