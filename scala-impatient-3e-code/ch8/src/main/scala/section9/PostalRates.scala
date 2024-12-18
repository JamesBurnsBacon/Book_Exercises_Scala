package section9

def lookup(rates: Array[(Double, Double)])(x: Double) = 
  rates.find(x <= _(0)) match
    case Some((_, price)) => price
    case None => -1

// PostalRates.scala
sealed abstract class PostalRate :
   def letter(oz: Double): Double

class DomesticRate extends PostalRate :
   override def letter(oz: Double) = lookup(Array((1.0, 0.58), (2.0, 0.78), (3.0, 0.98), (3.5, 1.18)))(oz)

class InternationalRate extends PostalRate :
   override def letter(oz: Double) = lookup(Array((1.0, 1.3), (2.0, 2.25), (3.0, 3.2), (3.5, 4.14)))(oz)
