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
