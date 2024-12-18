// A tuple:
(1, 3.14, "Fred")

// Accessing an element:
val t = (1, 3.14, "Fred")
val second = t(1) // second has type Double

// Alternative one-based accessors:
val third = t._3 // Sets third to "Fred"

// Defining variables by extracting the tuple elements: 
{
  val (first, second, third) = t // Sets first to 1, second to 3.14, third to "Fred"
  s"$first $second $third"
}
{
  val (first, second, _) = t
  s"$first $second"
}

// Concatenating tuples
("x", 3) ++ ("y", 4) // Yields ("x", 3, "y", 4)

// A method that returns a tuple
"New York".partition(_.isUpper) // Yields the pair ("NY", "ew ork")
