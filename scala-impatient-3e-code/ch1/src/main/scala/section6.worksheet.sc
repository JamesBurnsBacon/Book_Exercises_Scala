// Parentheses are also used for element access: 
val s = "Hello"
s(4) // Yields 'o'

// This call doesn't work
// "Bonjour".sorted(3)

// Remedy:
val result = "Bonjour".sorted
result(3)

// or
"Bonjour".sorted.apply(3)

// These two expressions are equivalent:
BigInt("1234567890")
BigInt.apply("1234567890")

// You don't need "new" to construct objects: 
BigInt("1234567890") * BigInt("112358111321")

// The concat method accepts any IterableOnce[Char], here from a range:
"bob".concat('c'.to('z')) // Yields "bobcdefghijklmnopqrstuvwxyz"

// When in doubt, try it out in the REPL or a worksheet:
"Scala".sorted // Yields "Saacl"