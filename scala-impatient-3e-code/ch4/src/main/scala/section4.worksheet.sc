val map = Map("USA" -> 1, "Switzerland" -> 41, "Germany" -> 49)
def process(k: String, v: Int) = println(s"Country: $k, Code: $v")
// Iterating over entries:
for ((k, v) <- map) process(k, v)

// The key and value sets
val scores = Map("Alice" -> 10, "Bob" -> 7, "Fred" -> 8, "Cindy" -> 7)
scores.keySet // Yields a set with elements "Alice", "Bob", "Fred", and "Cindy"
for (v <- scores.values) println(v) // Prints 10 7 8 7

// Inverting a map: 
for ((k, v) <- map) yield (v, k)

// Immutable maps are traversed in insertion order: 
Map("Fred" -> 1, "Alice" -> 2, "Bob" -> 3)

// The traversal order of mutable maps is not predictable: 
scala.collection.mutable.Map("Fred" -> 1, "Alice" -> 2, "Bob" -> 3)
  // Printed as HashMap(Fred -> 1, Bob -> 3, Alice -> 2)

// Use a LinkedHashMap to retain insertion order:
scala.collection.mutable.LinkedHashMap("Fred" -> 1, "Alice" -> 2, "Bob" -> 3)
  // Printed as LinkedHashMap(Fred -> 1, Alice -> 2, Bob -> 3)

// Sorted maps are traversed in the sort order of the keys:
scala.collection.SortedMap("Fred" -> 1, "Alice" -> 2, "Bob" -> 3)
scala.collection.mutable.SortedMap("Fred" -> 1, "Alice" -> 2, "Bob" -> 3)
  // Printed as TreeMap(Alice -> 2, Bob -> 3, Fred -> 1)
