import scala.io.*
var logString = ""
def log(x: Any) = logString = logString + x + " "

def numsFrom(n: BigInt): LazyList[BigInt] = { log(n) ; n } #:: numsFrom(n + 1)
val tenOrMore = numsFrom(10)
logString
tenOrMore.tail.tail.tail.head
logString
tenOrMore.tail.tail.tail.head
logString
val squares = numsFrom(1).map(x => x * x)
logString
squares.take(5).force
logString
val words = Source.fromFile("/usr/share/dict/words").getLines.to(LazyList)
words(0)
words(1)
words(0) // Cached
val palindromicSquares = (1 to 1000000).view
  .map(x => x * x)
  .filter(x => x.toString == x.toString.reverse)
palindromicSquares.take(10).mkString(",")
