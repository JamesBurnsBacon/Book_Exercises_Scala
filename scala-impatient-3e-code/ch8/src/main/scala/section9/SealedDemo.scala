package section9
/*
// This class definition won't compile because PostalRate is sealed 
class IntergalacticRate extends PostalRate :
  override def letter(x: Double) = Double.MaxValue
*/

@main def demo2 = 
  val r = scala.math.random()
  val weight = 2.1
  val rate = if r < 0.5 then DomesticRate() else InternationalRate()
  val result = rate match
    case r: DomesticRate => f"Domestic letter rate ${rate.letter(weight)}%.2f"
    case r: InternationalRate => f"International letter rate ${rate.letter(weight)}%.2f"
  println(result)
