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
