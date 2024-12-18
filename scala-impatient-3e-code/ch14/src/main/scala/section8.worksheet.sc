// A pattern can be used to declare variables 

val (a, b) = (1, 2)

// Useful when a function returns a pair

val (q, r) = BigInt(10) /% 3

// Syntax for extractor patterns

val arr = Array(0, 1.7, 2, 9)
val Array(0, second, rest*) = arr

// Caution: Constants start with uppercase letter
import scala.math.*
arr(0) = Pi
val Array(Pi, x, _*) = arr

// This is legal Scala
val 2 = b
