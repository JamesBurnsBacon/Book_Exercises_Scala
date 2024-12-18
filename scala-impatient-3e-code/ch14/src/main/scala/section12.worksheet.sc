// This match is exhaustive:

val scores = Map("Alice" -> 10, "Bob" -> 6, "Cindy" -> 8)
scores.get("Alice") match
  case Some(score) => println(score)
  case None => println("No score")

// The @unchecked annotation suppresses warnings for non-exhaustive matches:

(scores.get("Alice"): @unchecked) match
  case Some(score) => println(score)
