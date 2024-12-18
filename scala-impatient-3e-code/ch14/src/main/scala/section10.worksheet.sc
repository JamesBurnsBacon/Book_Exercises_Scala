// Two case classes extending a non-case class

abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount

// A case object for a singleton

case object Nothing extends Amount

// Case classes play nice with pattern matching

val amt: Amount = Dollar(100)

// Some is a case class, None a case object

val scores = Map("Alice" -> 10, "Bob" -> 6, "Cindy" -> 8)
scores.get("Alice") match
  case Some(score) => println(score)
  case None => println("No score")

amt match
  case Dollar(v) => s"$$$v"
  case Currency(_, u) => s"Oh noes, I got $u"
  case Nothing => ""

// The copy method

val price = Currency(29.95, "EUR")
var discounted = price.copy()
discounted = price.copy(value = 19.95) // Currency(19.95, "EUR")
discounted = price.copy(unit = "CHF") // Currency(29.95, "CHF")
