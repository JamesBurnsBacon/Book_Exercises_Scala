file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch4/src/main/scala/exercises.worksheet.sc
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/james/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.14/scala-library-2.13.14-sources.jar!/scala/Option.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 5307
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
  //import java.util.*
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
  val source3 = Source.fromFile("scala-impatient-3e-code/ch4/src/main/scala/myfile.txt")
  
  val wordCounts3: Map[String, Int] = source3.getLines().toList
      .flatMap(_.split("\\W+")) //lines into words
      .map(_.toLowerCase())
      .filter(_.nonEmpty)
      .foldLeft(Map.empty[String, Int]) { (c,w) =>
          c + (w -> (c.getOrElse(w, 0) + 1) )
      }
  
  source3.close()
  
  for ((w, c) <- wordCounts3) do println(s"$w: $c")
  
  // 4 Repeat the preceding exercise with a sorted map, printing the words in sort order
  // completing sorting at print request
  val source4 = Source.fromFile("scala-impatient-3e-code/ch4/src/main/scala/myfile.txt")
  
  val wordCounts4: Map[String, Int] = source4.getLines().toSeq
      .sortWith(( s, t) => s.charAt(0) < t.charAt(0))
      .flatMap(_.split("\\W+")) //lines into words
      .map(_.toLowerCase())
      .filter(_.nonEmpty)
      .foldLeft(Map.empty[String, Int]) { (c,w) =>
          c + (w -> (c.getOrElse(w, 0) + 1) )     
      }
  
  source4.close()
  
  wordCounts4.toSeq.sortBy(_._1).foreach {
      case (w, c) => println(s"$w: $c")
  }
  
  // 5 Repeat the preceding exercise with a TreeMap
  // a treemap is a sorted map, when traversal in ordering is desired.
  // immutable.HashMap has better performance when key-value otder traversal doesn't matter
  // if you need insertion order, use immutable.SeqMap
  
  val source5 = Source.fromFile("scala-impatient-3e-code/ch4/src/main/scala/myfile.txt")
  
  val wordCounts5: TreeMap[String, Int] = source5.getLines().toSeq
      .flatMap(_.split("\\W+")) //lines into words
      .map(_.toLowerCase())
      .filter(_.nonEmpty)
      .foldLeft(TreeMap.empty[String, Int]) { (c,w) =>
          c + (w -> (c.getOrElse(w, 0) + 1) )     
      }
  
  source5.close()
  
  for ((w, c) <- wordCounts5) do println(s"$w: $c")
  // 6 Define a linked hash map that maps "Monday" to java.util.calendar.MONDAY,
  // and similarly for the other weekdays. Demonstrate elements visited in insertion order
  import scala.collection.mutable.LinkedHashMap
  import java.util.Calendar
  
  val weekdayMap = LinkedHashMap(
      "Monday" -> Calendar.MONDAY,
      "Tuesday" -> Calendar.TUESDAY,
      "Wednesday" -> Calendar.WEDNESDAY,
      "Thursday" -> Calendar.THURSDAY,
      "Friday" -> Calendar.FRIDAY,
      "Saturday" -> Calendar.SATURDAY,
      "Sunday" -> Calendar.SUNDAY
  )
  
  for ((k,v) <- weekdayMap) do println(s"$k: $v")
  
  // 7 Print a table of all Java properties reported by the getProperties method of the
  // java.lang.System class. Find length of longest key before printing table.
  import java.lang.System
  import scala.collection.JavaConverters.*
  
  val props = System.getProperties.asScala
  
  val longestKeyLen = props.keys.map(_.length).max
  
  println(s"Longest Key Length: $longestKeyLen")
  for ((k,v) <- props) do println(s"$k: $v")
  
  // 8 Write a function minmax(values: Array[Int]) that returns a pair containing the smallest
  // and the largest values in the nonempty array
  def minmax(values: Array[Int]) = (values.min, values.max)
  
  minmax(Array(1,3,5,9))
  // 9 Reimplement the function from preceding ex to return an Option that is None if
  // the array happens to be empty
  def minmax9(values: Array[Int]) =
      if values.length != 0 then
          (values.min, values.max)
      else
          val OpNone: Option[Int] = None
  
  minmax9(Array())
  minmax9(Array(1,3,5,9))
  
  // 10 Prompt the user for a first and last letter, then prints a matching word from
  // scala.io.Source.fromFile("/usr/share/dict/words").mkString.split("\n")
  // use find. What alternatives do you have for dealing with the returned option?
  
  val firstLetter = readLine("Enter first letter: ").toLowerCase
  val lastLetter = readLine("Enter last letter: ").toLowerCase
  
  val words = Source.fromFile("/usr/share/dict/words").getLines().toSeq
  
  val matchingWord = words.find(word =>
      word.nonEmpty &&
      word.head.toLower == firstLetter.charAt(0) &&
      word.last.toLower == lastLetter.charAt(0)
  )
  
  matchingWord m@@
  
  // 11 Demonstrate the argument of getOrElse method in the Option class is eval'd lazily
  
  
  // 12 function lteqgt(values: Array[Int], v: Int) that returns a triple with counts
  // of values less than v, equal to v, and greater than v.
  
  
  // 13 What happens when you zip together two strings? Come up with a use case
}
```



#### Error stacktrace:

```
java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:182)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:153)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
	java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
	java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:232)
	java.base/java.nio.file.Path.of(Path.java:147)
	java.base/java.nio.file.Paths.get(Paths.java:69)
	scala.meta.io.AbsolutePath$.apply(AbsolutePath.scala:58)
	scala.meta.internal.metals.MetalsSymbolSearch.$anonfun$definitionSourceToplevels$2(MetalsSymbolSearch.scala:70)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.MetalsSymbolSearch.definitionSourceToplevels(MetalsSymbolSearch.scala:69)
	scala.meta.internal.metals.StandaloneSymbolSearch.$anonfun$definitionSourceToplevels$5(StandaloneSymbolSearch.scala:108)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.StandaloneSymbolSearch.$anonfun$definitionSourceToplevels$4(StandaloneSymbolSearch.scala:108)
	scala.Option.orElse(Option.scala:477)
	scala.meta.internal.metals.StandaloneSymbolSearch.definitionSourceToplevels(StandaloneSymbolSearch.scala:108)
	dotty.tools.pc.completions.CaseKeywordCompletion$.dotty$tools$pc$completions$CaseKeywordCompletion$$$sortSubclasses(MatchCaseCompletions.scala:342)
	dotty.tools.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:292)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:358)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:130)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:93)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:154)
```
#### Short summary: 

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/james/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.14/scala-library-2.13.14-sources.jar!/scala/Option.scala