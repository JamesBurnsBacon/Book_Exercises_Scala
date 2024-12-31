file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch4/src/main/scala/exercises.worksheet.sc
### java.lang.AssertionError: assertion failed: position error, parent span does not contain child span
parent      = new java.io.File(_root_.scala.Predef.???) # -1,
parent span = <1305..1573>,
child       = _root_.scala.Predef.??? # -1,
child span  = [1322..3002..3002]

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
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
  
  val wordCounts = Map[String, Int]().withDefaultValue(0)
  
  val in = new java.util.Scanner(new java.io.File("scala-
  
  while in.hasNext() do
      val word = in.next().toLowerCase().replaceAll("[^a-zA-Z0-9]","") //normalize words
      if word.nonEmpty then wordCounts(word) += 1
  
  in.close()
  
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
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:177)
	dotty.tools.dotc.ast.Positioned.check$1$$anonfun$3(Positioned.scala:207)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:334)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:207)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:228)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:202)
	dotty.tools.dotc.ast.Positioned.check$1$$anonfun$3(Positioned.scala:207)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:334)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:207)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:228)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:202)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:228)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:202)
	dotty.tools.dotc.ast.Positioned.check$1$$anonfun$3(Positioned.scala:207)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:334)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:207)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:228)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:202)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:228)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:202)
	dotty.tools.dotc.ast.Positioned.check$1$$anonfun$3(Positioned.scala:207)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:334)
	dotty.tools.dotc.ast.Positioned.check$1(Positioned.scala:207)
	dotty.tools.dotc.ast.Positioned.checkPos(Positioned.scala:228)
	dotty.tools.dotc.parsing.Parser.parse$$anonfun$1(ParserPhase.scala:39)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:503)
	dotty.tools.dotc.parsing.Parser.parse(ParserPhase.scala:40)
	dotty.tools.dotc.parsing.Parser.$anonfun$2(ParserPhase.scala:52)
	scala.collection.Iterator$$anon$6.hasNext(Iterator.scala:479)
	scala.collection.Iterator$$anon$9.hasNext(Iterator.scala:583)
	scala.collection.immutable.List.prependedAll(List.scala:152)
	scala.collection.immutable.List$.from(List.scala:685)
	scala.collection.immutable.List$.from(List.scala:682)
	scala.collection.IterableOps$WithFilter.map(Iterable.scala:900)
	dotty.tools.dotc.parsing.Parser.runOn(ParserPhase.scala:51)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:343)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1323)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:336)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:384)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:396)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:69)
	dotty.tools.dotc.Run.compileUnits(Run.scala:396)
	dotty.tools.dotc.Run.compileSources(Run.scala:282)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:161)
	dotty.tools.pc.MetalsDriver.run(MetalsDriver.scala:47)
	dotty.tools.pc.WithCompilationUnit.<init>(WithCompilationUnit.scala:31)
	dotty.tools.pc.SimpleCollector.<init>(PcCollector.scala:351)
	dotty.tools.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:63)
	dotty.tools.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:88)
	dotty.tools.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:116)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: position error, parent span does not contain child span
parent      = new java.io.File(_root_.scala.Predef.???) # -1,
parent span = <1305..1573>,
child       = _root_.scala.Predef.??? # -1,
child span  = [1322..3002..3002]