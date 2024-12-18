// Constructing a mutable map:
val scores = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

// Updating or adding entries:
scores("Bob") = 10 
  // Updates the existing value for the key "Bob" (assuming scores is mutable)
scores("Fred") = 7 
  // Adds a new key/value pair to scores (assuming it is mutable)
scores ++= Map("Bob" -> 10, "Fred" -> 7)

// Removing an entry:
scores -= "Alice"

// Adding entries to an immutable map yields another immutable map: 
val someScores = Map("Alice" -> 10, "Bob" -> 3)
val moreScores = someScores + ("Cindy" -> 7) // Yields a new immutable map

// Updating a var with immutable maps:
var currentScores = moreScores
currentScores = currentScores + ("Fred" -> 0)
currentScores += "Donald" -> 5
currentScores = currentScores - "Alice"
currentScores -= "Alice"
currentScores
