package scala$minusimpatient$minus3e$minuscode.ch14.src.main.scala


final class section11$u002Eworksheet$_ {
def args = section11$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch14/src/main/scala/section11.worksheet.sc"""
/*<script>*/
// Nested matches

abstract class Item
case class Article(description: String, price: Double) extends Item
case class Bundle(description: String, discount: Double, items: Item*) extends Item

val wish = Bundle("Father's day special", 20.0,
  Article("Scala for the Impatient", 39.95),
  Bundle("Anchor Distillery Sampler", 10.0,
    Article("Old Potrero Straight Rye Whiskey", 79.95),
    Article("Junípero Gin", 32.95)))

wish match 
  case Bundle(_, _, Article(descr, _), _*) => s"First article in bundle: $descr"

wish match
  case Bundle(_, _, art @ Article(_, _), _*) => s"art: $art"

def price(it: Item): Double = it match
  case Article(_, p) => p
  case Bundle(_, disc, its*) => its.map(price _).sum - disc
price(wish)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section11$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section11$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section11$u002Eworksheet_sc.script as `section11.worksheet`

