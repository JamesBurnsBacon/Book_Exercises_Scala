// Array object is an extractor with an unapply method

val arr = Array(1, 7, 2, 9)

arr match
  case Array(x, 0) => x
  case Array(_, rest*) => rest.min
  
Array.unapplySeq(arr)

// A regex pattern is an extractor

val pattern = "([0-9]+) ([a-z]+)".r
"99 bottles" match
  case pattern(quantity, item) => s"{ quantity: $quantity, item: $item }"
    // Sets quantity to "99", item to "bottles"

pattern.unapplySeq("99 bottles")
