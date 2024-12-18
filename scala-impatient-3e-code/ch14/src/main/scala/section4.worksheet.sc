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
