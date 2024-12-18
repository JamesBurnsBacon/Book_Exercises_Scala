// Unary operators
val a = 42
// The following two are the same:
-a
a.unary_-

import scala.language.postfixOps
42 toString

/*
// Unary postfix operators can result in parsing errors
val result = 42 toString
println(result)
*/
