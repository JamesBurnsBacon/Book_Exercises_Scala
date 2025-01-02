file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch5/src/main/scala/exercises.worksheet.sc
### java.lang.AssertionError: assertion failed

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
uri: file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch5/src/main/scala/exercises.worksheet.sc
text:
```scala
object worksheet{
  // 1 improve Counter class so that it doesn't turn negative at Int.MaxValue
  class Counter(private var value: Int = 0):
    def increment() = if(value + 1 < Int.MaxValue) then value += 1 else print
    def current = value
    
  def counterDemo =
    val myCounter = Counter()
    myCounter.increment() 
    println(myCounter.current)
  
  counterDemo
  
  // 2 class BankAccount with methods deposit and withdraw, read only balance property
  
  
  // 3 class Time with read only properties of hours and minutes, and a method
  // before(other:Time): Boolean that checks whether this time comes before the other
  // A Time object should be constructed as Time(hrs, min), where hrs is in military
  // time format (between 0 and 23)
  
  
  // 4 reimplement above class so that the internal representation is a number of minutes
  // since midnight (between 0 and 24 * 60 - 1). Do not change the public interface.
  // client code should be unaffected by your change.
  
  
  // 5 In the Person class, provide a primary constructor that turns negative ages to 0
  
  
  // 6 class Person with a primary constructor that accepts a string containing a firstname
  // a space, and a last name (such as "Donald Clinton"). Supply read-only properties
  // firstName and lastName. Should the primary constructor parameter be a var val or plain?
  
  
  // 7 class Car with read-only properties for manufacturer, model name, model year, and a
  // read-write property for the license plate. Supply four constructors. All require the
  // manufacturer and model name. Optionally, model year and license plate can also be specified
  // in the constructor. If not, the model year is set to -1 and license plate to empty str.
  // Which constructor are you choosing as the primary constructor? Why?
  
  
  // 8 reimplement above class in Python. How much shorter is the scala class?
  
  
  // 9 consider the class
  // class Employee(val name: String, var salary:Double):
  //    def this() = this("John Q. Public", 0.0)
  // rewrite to use explicit fields and a default primary constructor. Which form do you
  // prefer? Why?
  
  
  // 10 implement the equals method for the Member class that is nested inside the Network
  // class. For two members to be equal, they need to be in the same network.
}
```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:11)
	dotty.tools.dotc.core.TypeOps$.dominators$1(TypeOps.scala:245)
	dotty.tools.dotc.core.TypeOps$.approximateOr$1(TypeOps.scala:381)
	dotty.tools.dotc.core.TypeOps$.orDominator(TypeOps.scala:399)
	dotty.tools.dotc.core.Types$OrType.join(Types.scala:3684)
	dotty.tools.dotc.core.Types$OrType.widenUnionWithoutNull(Types.scala:3700)
	dotty.tools.dotc.core.Types$Type.widenUnion(Types.scala:1386)
	dotty.tools.dotc.core.ConstraintHandling.widenOr$1(ConstraintHandling.scala:663)
	dotty.tools.dotc.core.ConstraintHandling.widenInferred(ConstraintHandling.scala:684)
	dotty.tools.dotc.core.ConstraintHandling.widenInferred$(ConstraintHandling.scala:29)
	dotty.tools.dotc.core.TypeComparer.widenInferred(TypeComparer.scala:31)
	dotty.tools.dotc.core.TypeComparer$.widenInferred(TypeComparer.scala:3298)
	dotty.tools.dotc.typer.Namer.rhsType$1(Namer.scala:2138)
	dotty.tools.dotc.typer.Namer.cookedRhsType$1(Namer.scala:2144)
	dotty.tools.dotc.typer.Namer.lhsType$1(Namer.scala:2145)
	dotty.tools.dotc.typer.Namer.inferredResultType(Namer.scala:2156)
	dotty.tools.dotc.typer.Namer.inferredType$1(Namer.scala:1802)
	dotty.tools.dotc.typer.Namer.valOrDefDefSig(Namer.scala:1808)
	dotty.tools.dotc.typer.Namer.defDefSig(Namer.scala:1934)
	dotty.tools.dotc.typer.Namer$Completer.typeSig(Namer.scala:830)
	dotty.tools.dotc.typer.Namer$Completer.completeInCreationContext(Namer.scala:985)
	dotty.tools.dotc.typer.Namer$Completer.complete(Namer.scala:859)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:175)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:190)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:192)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.ensureCompleted(SymDenotations.scala:393)
	dotty.tools.dotc.typer.Typer.retrieveSym(Typer.scala:3362)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3387)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3499)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3577)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3581)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3603)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3649)
	dotty.tools.dotc.typer.Typer.typedClassDef(Typer.scala:3097)
	dotty.tools.dotc.typer.Typer.typedTypeOrClassDef$1(Typer.scala:3403)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3407)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3499)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3577)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3581)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3603)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3649)
	dotty.tools.dotc.typer.Typer.typedClassDef(Typer.scala:3097)
	dotty.tools.dotc.typer.Typer.typedTypeOrClassDef$1(Typer.scala:3403)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3407)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3499)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3577)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3581)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3603)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3649)
	dotty.tools.dotc.typer.Typer.typedPackageDef(Typer.scala:3230)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3449)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3500)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3577)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3581)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3692)
	dotty.tools.dotc.typer.TyperPhase.typeCheck$$anonfun$1(TyperPhase.scala:47)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:503)
	dotty.tools.dotc.typer.TyperPhase.typeCheck(TyperPhase.scala:53)
	dotty.tools.dotc.typer.TyperPhase.$anonfun$4(TyperPhase.scala:99)
	scala.collection.Iterator$$anon$6.hasNext(Iterator.scala:479)
	scala.collection.Iterator$$anon$9.hasNext(Iterator.scala:583)
	scala.collection.immutable.List.prependedAll(List.scala:152)
	scala.collection.immutable.List$.from(List.scala:685)
	scala.collection.immutable.List$.from(List.scala:682)
	scala.collection.IterableOps$WithFilter.map(Iterable.scala:900)
	dotty.tools.dotc.typer.TyperPhase.runOn(TyperPhase.scala:98)
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

java.lang.AssertionError: assertion failed