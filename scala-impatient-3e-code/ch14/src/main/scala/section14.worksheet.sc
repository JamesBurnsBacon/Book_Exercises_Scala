// Case classes are products

// This class has 13 x 4 = 52 values
enum Rank { case ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
  EIGHT, NINE, TEN, JACK, QUEEN, KING } // 13 values
enum Suit { case DIAMONDS, HEARTS, SPADES, CLUBS } // 4 values
case class Card(r: Rank, s: Suit) // 13 × 4 = 52 values

// Every case class extends Product and has methods _1, _2, ...

abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount

val price = Currency(100, "CHF")
price._1 // 100
price._2 // "CHF"

// The unapply method simply returns its argument

Currency.unapply(price) == price
