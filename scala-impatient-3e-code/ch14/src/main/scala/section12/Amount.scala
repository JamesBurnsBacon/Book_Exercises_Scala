package section12

sealed abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount

def exchangeRate(unit: String) = 0.9 // TODO: Get rate from internet

def total(amounts: Seq[Amount]) =
  var sum = 0.0
  for amount <- amounts do
    amount match 
      // Uncommenting the line below removes the non-exhaustiveness warning
      // case Dollar(value) => sum += value
      case Currency(value, unit) => sum += value * exchangeRate(unit)
  sum
