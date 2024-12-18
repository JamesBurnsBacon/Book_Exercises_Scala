// Constructing an immutable map:
val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

// The arrows are shortcut for pairs or "tuples" of length 2:
"Alice" -> 10
("Alice", 10)

// You can construct a map with pairs:
Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))

// You usually need to allow for absent keys:
scores("Bob") // Like scores.get("Bob") in Java or scores["Bob"] in JavaScript, Python, or C++
if (scores.contains("Donald")) scores("Donald") else 0
val scores2 = scores.withDefaultValue(0)
scores2("Zelda")
  // Yields 0 since "Zelda" is not present
val scores3 = scores.withDefault(_.length)
scores3("Zelda")
  // Yields 5, applying the length function to the key that is not present
