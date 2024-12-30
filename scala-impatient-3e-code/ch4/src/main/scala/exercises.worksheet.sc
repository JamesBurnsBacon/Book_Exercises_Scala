// 1 Map of prices for a number of gizmos. Then a second map with same keys but
// prices at a ten percent discount
val fullPrices = Map("pen" -> 1.00, "book" -> 10.00, "GPU" -> 1000.00)
for (k,v) <- fullPrices yield (k,v*.9)

// 2 Read words from a file using java.util.Scanner
// use a mutable map to count the frequency of words.
// at the end, print out the words and their counts
import java.util.*
import scala.collection.mutable

val wordCounts = mutable.Map[String, Int]().withDefaultValue(0)

val in = new java.util.Scanner(new java.io.File("scala-impatient-3e-code/ch4/src/main/scala/myfile.txt"))

while in.hasNext() do
    val word = in.next().toLowerCase().replaceAll("[^a-zA-Z0-9]","") //normalize words
    if word.nonEmpty then wordCounts(word) += 1

in.close()
for ((w, c) <- wordCounts) do println(s"$w: $c")