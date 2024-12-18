val numitemPattern = "([0-9]+) ([a-z]+)".r
for m <- numitemPattern.findAllMatchIn("99 bottles, 98 bottles") do
  println(m.group(1)) // Prints 99 and 98
val numitemPattern(num, item) = "99 bottles"
  // Sets num to "99", item to "bottles"

val str = "97 cans"
str match
  case numitemPattern(num, item) => s"found $num $item"
  case _ => "no match"

def process(num: String, item: String) = println(s"found $num $item")
for numitemPattern(num, item) <- numitemPattern.findAllIn("99 bottles, 98 bottles") do
  process(num, item)
