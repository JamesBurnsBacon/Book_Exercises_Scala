package scala$minusimpatient$minus3e$minuscode.ch14.src.main.scala


final class section10$u002Eworksheet$_ {
def args = section10$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch14/src/main/scala/section10.worksheet.sc"""
/*<script>*/
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

/*</script>*/ /*<generated>*//*</generated>*/
}

object section10$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section10$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section10$u002Eworksheet_sc.script as `section10.worksheet`

