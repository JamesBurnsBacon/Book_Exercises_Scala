import scala.io.*

@main def demo3 =
  val source = Source.fromFile("values.txt", "UTF-8")
  val tokens = source.mkString.split("\\s+")
  val numbers = for w <- tokens yield w.toDouble
  println(s"tokens: ${tokens.toSeq}")
  println(s"numbers: ${numbers.toSeq}")

  print("How old are you? ")
  val age = StdIn.readInt()
    // Or use readDouble or readLong
  println(s"Next year, you'll be ${age + 1}")
