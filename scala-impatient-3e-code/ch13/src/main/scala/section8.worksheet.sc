import scala.collection.mutable.ArrayBuffer

val names = List("Peter", "Paul", "Mary")
// The following are the same
names.map(_.toUpperCase) // List("PETER", "PAUL", "MARY")
for (n <- names) yield n.toUpperCase

// map vs flatMap
def ulcase(s: String) = Vector(s.toUpperCase, s.toLowerCase)
names.map(ulcase)
names.flatMap(ulcase)

// The following are the same
for (i <- 1 to 10) yield i * i
(1 to 10).map(i => i * i)

// The following are the same
for (i <- 1 to 10; j <- 1 to i) yield i * j
(1 to 10).flatMap(i => (1 to i).map(j => i * j))

// mapInPlace is like map, but in-place for mutable collections
val buffer = ArrayBuffer("Peter", "Paul", "Mary")
buffer.mapInPlace(_.toUpperCase)
buffer

// foreach is like map, but only for the side effect
names.foreach(println)

// collect is like map, but with a partial function
"-3+4".collect({ case '+' => 1 ; case '-' => -1 }) // Vector(-1, 1)

// groupBy groups elements that map to the same value
val words = "Mary had a little lamb. Its fleece was white as snow.".split("\\PL"")
val map = words.groupBy(_.substring(0, 1).toUpperCase)
