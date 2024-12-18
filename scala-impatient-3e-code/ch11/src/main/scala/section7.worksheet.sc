// The apply and update methods
val scores = scala.collection.mutable.HashMap[String, Int]()
scores("Bob") = 100 // Calls scores.update("Bob", 100)
val bobsScore = scores("Bob") // Calls scores.apply("Bob")
scores.update("Alice", 95)
scores.apply("Alice")
scores
