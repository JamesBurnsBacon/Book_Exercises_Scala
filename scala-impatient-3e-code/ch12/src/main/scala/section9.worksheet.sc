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
