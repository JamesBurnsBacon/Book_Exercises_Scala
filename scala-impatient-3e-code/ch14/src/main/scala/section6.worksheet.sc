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
