file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.sc
### java.lang.AssertionError: assertion failed: position error, parent span does not contain child span
parent      =  extends CommandLineParser.FromString[LocalDate] {
  def fromString = _root_.scala.Predef.???
} # -1,
parent span = <3495..3561>,
child       = def fromString = _root_.scala.Predef.??? # -1,
child span  = [3547..3551..3566]

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
uri: file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.sc
text:
```scala
object worksheet{
  // 1 prints the message on the first line, and empty parentheses on the second line
  import scala.compiletime.ops.double
  //It prints the parentheses as if literal
  println(println("Hello"))
  
  // 2 value and type of empty block expression {}, has only the absence of meaningful data
  type {} //Unit
   
  // 3  assignment where x = y = 1 is valid
  var i: Any = 0
  var j = 0
  
  i = j = 1 // Does not set i to 1
  
  // 4 Scala loop from Java syntax: for(int i = 10, i >= 0; i--)System.out.println(i);
  var i :Int = 10
  while i >= 0 do
    println(i)
    i -= 1
  end while
  
  // 5 the signum of a number is 1 if positive, -1 if negative, and zero if 0
  def signum(n: Double) =
      def abs(x: Double) = if x >= 0 then x else -x
      if n != 0 then
          n/abs(n)
      else
          0
  
  // 6 function countdown(n:Int) that prints the numbers from n to 0 w/o returning val
  //var number7: Int = 7
  def countdown(n: Int) =
      var count = n
      while count >= 0 do
        println(count)
        count -= 1
      end while
  countdown(7)    
  
  // 7 Write a for loop for computing product of unicode codes of all letters in str.
  val h = "Hello"
  var product = 1
  def unicodeProduct(s: String) =
      for i <- 0 to h.length -1 do
          product *= h(i).toInt
      product
  
  // 8 Solve preceding without writing a loop
  def unicodeProduct2(s: String = "Hello") =
      var product = 1
      s.foreach(product *= _)
      product
  unicodeProduct2()
  //another formatting
  def unicodeProduct2a(s: String = "Hello") =
      var product = 1
      s.foreach(c => product *= c)
      product
  unicodeProduct2a()
  
  // 9 Write a function that computes the product named product(s: String)
  def product(s: String = "Hello") =
      var productTotal = 1
      s.foreach(c => productTotal *= c)
      productTotal
  product()
  
  // 10 Make the function recursive
  def productRecursive(s: String) : Int =
      if s.length == 0 then 1
      else s.head * productRecursive(s.tail)
  productRecursive("Hello")        
  
  // 11 Function computes x^n where n is an integer, recursively
  def recursiveExponent(x: BigDecimal, n: Integer) : BigDecimal =
      if n == 0 then 1
      else if n > 0 then
        if n % 2 == 0 then recursiveExponent(x, n / 2) * recursiveExponent(x, n / 2) // + even n's
        else x * recursiveExponent(x,n - 1) // + odd n's
      else 1 / recursiveExponent(x, -n)//negative n's
  recursiveExponent(3,3)
  
  // 12 String interpolator
  object DateInterpolator {
      import java.time.LocalDate
  
      extension (sc: StringContext)
          def date(args: Any*): LocalDate =
              
              if sc.parts.length != args.length +1 then
                  throw new IllegalArgumentException("Expected format is 'yyyy-mm-dd'.")
              else
                  val year = args(0).asInstanceOf[Int]
                  val month = args(1).asInstanceOf[Int] 
                  val day = args(2).asInstanceOf[Int]
                  LocalDate.of(year, month, day)
  }
  val year = 2024; val month = 07; val day = 04
  
  //import Exercises$u002Eworksheet$_.this.DateInterpolator.date
  import DateInterpolator.date
  val testDate = date"$year-$month-$day"
  println(testDate)  
  
  // 13 Parse a command line arg into an arbitrary type
  import java.time.*
  import scala.util.* 
  given CommandLineParser.FromString[LocalDate] with
      def fromString
  
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
parent      =  extends CommandLineParser.FromString[LocalDate] {
  def fromString = _root_.scala.Predef.???
} # -1,
parent span = <3495..3561>,
child       = def fromString = _root_.scala.Predef.??? # -1,
child span  = [3547..3551..3566]