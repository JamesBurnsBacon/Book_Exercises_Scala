val x0 = 2
val x = 5
val y0 = 3
val y = 7

// The value of a block is the last expression: 
var distance = { val dx = x - x0; val dy = y - y0; scala.math.sqrt(dx * dx + dy * dy) }

// You can use indentation instead of braces:
distance =
  val dx = x - x0
  val dy = y - y0
  scala.math.sqrt(dx * dx + dy * dy)

// Block indentation is common with branches and loops:
var a = 2
var r = 1
var n = 10
if n % 2 == 0 then
  a = a * a
  n = n / 2
else
  r = r * a
  n -= 1

// This block has a Unit value
{ r = r * a; n -= 1 }
var i: Any = 0
var j = 0

// This assignment does not set i to 1:
i = j = 1 // Does not set i to 1

// Use two assignments, don't chain 
j = 1
i = j
