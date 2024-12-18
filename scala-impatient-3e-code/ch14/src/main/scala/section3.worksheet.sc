// Bind variable to match

var number = 0
var sign = 1
val str = "-123"
for (i <- str.indices) 
  str(i) match
    case '+' => sign = 1
    case '-' => sign = -1
    case d => number = number * 10 + Character.digit(d, 10)
sign * number

// Can use variable in guard

number = 0
sign = 1
for (i <- str.indices)
  str(i) match
    case '+' => sign = 1
    case '-' => sign = -1
    case d if Character.isDigit(d) => number = 10 * number + Character.digit(d, 10)
sign * number

// Caution: Uppercase constants, lowercase variables

// https://en.wikipedia.org/wiki/Isoperimetric_inequality
val c = 2 * scala.math.Pi // circumference of unit circle
val a = scala.math.Pi // area of unit circle
import scala.math.*
4 * a / (c * c) match
  case Pi => "a circle" // Pi equals 4 * a / (c * c)
  case q => f"not a circle, quotient $q%f" // q set to 4 * a / (c * c)

// Use backticks with a lowercase constant

for ch <- "src/main/scala/Main.scala" yield
  import java.io.File.* // Imports java.io.File.separatorChar
  ch match
    case `separatorChar` => '\\' // ch equals java.io.File.separatorChar
    case _ => ch
