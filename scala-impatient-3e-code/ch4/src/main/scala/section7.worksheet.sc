// Using an Option is better than a blank or null default

var friend: Option[String] = Some("Fred")
friend = None // No friend

// Map.get yields an option

val scores = Map("Alice" -> 10, "Bob" -> 7, "Cindy" -> 8)
val alicesScore = scores.get("Alice") // Some(10)
val dansScore = scores.get("Dan") // None

// Not so good: Using isEmpty/get 

if alicesScore.isEmpty
  then println("No score")
  else println(alicesScore.get)

// Good: getOrElse

println(alicesScore.getOrElse("No score"))

// Good: Treating an option like a collection of size 0 or 1

for score <- alicesScore do println(score)

// Good: Use map, filter, foreach

val biggerScore = alicesScore.map(_ + 1) // Some(score + 1) or None
val acceptableScore = alicesScore.filter(_ > 5) // Some(score) if score > 5 or None
alicesScore.foreach(println) // Prints the score if it exists
