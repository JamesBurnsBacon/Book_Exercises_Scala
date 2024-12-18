package section10
import scala.language.implicitConversions

@main def demo = 
  import com.horstmann.impatient.FractionConversions.given
  val result = 3 * Fraction(4, 5) // Uses imported conversion fraction2Double
  println(result)

@main def demo2 =
  import com.horstmann.impatient.FractionConversions.int2Fraction
  val result = 3 * Fraction(4, 5) // result is Fraction(12, 5)
  println(result)

@main def demo3 =
  import com.horstmann.impatient.FractionConversions.{fraction2Double as _, given}
    // Imports everything but fraction2Double
  val result = 3 * Fraction(4, 5) 
  println(result)
