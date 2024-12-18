def abs(x: Double) = if x >= 0 then x else -x
abs(-273.15)

// The last expression of the function body is the return value:
val example1 = 
  def fac(n: Int) =
    var r = 1
    for i <- 1 to n do r = r * i
    r
  fac(10)

// Optionally, add an "end" statement to mark the end of the function body:
val example2 = 
  def fac(n: Int) =
    var r = 1
    for i <- 1 to n do r = r * i
    r
  end fac
  fac(10)

// Braces around the function body are ok too, but considered "noisy" in Scala 3:
val example3 = 
  def fac(n: Int) = {
    var r = 1
    for i <- 1 to n do r = r * i
    r
  }
  fac(10)
val example4 = 
  // With a recursive function, you must specify the return type:
  def fac(n: Int): Int = if n <= 0 then 1 else n * fac(n - 1)
  fac(10)

// This function returns no value:
import java.time.*
def log(sb: StringBuilder, message: String) = 
  sb.append(java.time.Instant.now())
  sb.append(": ")
  sb.append(message)
  sb.append("\n")

val sb = StringBuilder()
log(sb, "Hello, World!")
sb

// This function has no parameters:
val example5 =
  def words = scala.io.Source.fromFile("/usr/share/dict/words").mkString
  words

// The same function, with an empty parameter list:
val example6 =
  def words() = scala.io.Source.fromFile("/usr/share/dict/words").mkString
  words()

// Why not define a "val"? It gets executed whether you use it or not:
val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString
