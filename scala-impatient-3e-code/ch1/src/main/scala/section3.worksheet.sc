// Can invoke methods on integer values
1.toString() // Yields the string "1"
1.to(10) // Yields Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// These two expressions are equivalent:
"Hello".intersect("World") // Yields "lo"
scala.collection.StringOps("Hello").intersect("World")

// As are these two:
1.to(10)
scala.runtime.RichInt(1).to(10)

// Type conversions
99.44.toInt
99.toChar
