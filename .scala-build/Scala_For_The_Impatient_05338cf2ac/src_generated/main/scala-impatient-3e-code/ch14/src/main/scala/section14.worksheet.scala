package scala$minusimpatient$minus3e$minuscode.ch14.src.main.scala


final class section14$u002Eworksheet$_ {
def args = section14$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch14/src/main/scala/section14.worksheet.sc"""
/*<script>*/
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

/*</script>*/ /*<generated>*//*</generated>*/
}

object section14$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section14$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section14$u002Eworksheet_sc.script as `section14.worksheet`

