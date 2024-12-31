file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch4/src/main/scala/exercises.worksheet.sc
### java.lang.IndexOutOfBoundsException: -1

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1418
uri: file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch4/src/main/scala/exercises.worksheet.sc
text:
```scala
object worksheet{
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
  
  // 3 Repeat the preceding exercise with an immutable map,
  // choosing to switch to a scala source scanner- why use java so much?
  import scala.io.Source
  import scala.collection.immutable.*
  
  val source = source.fromFile("scala-impatient-3e-code/ch4/src/main/scala/myfile.txt")
  
  val wordCounts: Map[String, Int] = source.getLines()
      .flatMap(_.split("\\W+")) //lines into words
      .map(_.toLowerCase())
      .filter(_.nonEmpty)
      .foldLeft(Map.empty[String, Int]) { (c,@@)
  
      }
  
  while in.hasNext() do
      val word = in.next().toLowerCase().replaceAll("[^a-zA-Z0-9]","") //normalize words
      if word.nonEmpty then wordCounts(word) += 1
  
  source.close()
  
  for ((w, c) <- wordCounts) do println(s"$w: $c")
  
  // 4 Repeat the preceding exercise with a sorted map, printing the words in sort order
  
  
  // 5 Repeat the preceding exercise with a java.util.TreeMap adapted to sc API
  
  
  // 6 Define a linked hash map that maps "Monday" to java.util.calendar.MONDAY,
  // and similarly for the other weekdays. Demonstrate elements visited in insertion order
  
  
  // 7 Print a table of all Java properties reported by the getProperties method of the
  // java.lang.System class. Find length of longest key before printing table.
  
  
  // 8 Write a function minmax(values: Array[Int]) that returns a pair containing the smallest
  // and the largest values in the nonempty array
  
  
  // 9 Reimplement the function from preceding ex to return an Option that is None if
  // the array happens to be empty
  
  
  // 10 Prompt the user for a first and last letter, then prints a matching word from
  // scala.io.Source.fromFile("/usr/share/dict/words").mkString.split("\n")
  // use find. What alternatives do y9u have for dealing with the returned option?
  
  
  // 11 Demonstrate the argument of getOrElse method in the Option class is eval'd lazily
  
  
  // 12 function lteqgt(values: Array[Int], v: Int) that returns a triple with counts
  // of values less than v, equal to v, and greater than v.
  
  
  // 13 What happens when you zip together two strings? Come up with a use case
}
```



#### Error stacktrace:

```
scala.collection.LinearSeqOps.apply(LinearSeq.scala:129)
	scala.collection.LinearSeqOps.apply$(LinearSeq.scala:128)
	scala.collection.immutable.List.apply(List.scala:79)
	dotty.tools.dotc.util.Signatures$.applyCallInfo(Signatures.scala:244)
	dotty.tools.dotc.util.Signatures$.computeSignatureHelp(Signatures.scala:101)
	dotty.tools.dotc.util.Signatures$.signatureHelp(Signatures.scala:88)
	dotty.tools.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:47)
	dotty.tools.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:439)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: -1