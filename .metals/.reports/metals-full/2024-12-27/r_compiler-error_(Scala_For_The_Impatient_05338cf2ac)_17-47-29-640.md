file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch3/src/main/scala/exercises.worksheet.sc
### java.lang.AssertionError: assertion failed

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 798
uri: file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch3/src/main/scala/exercises.worksheet.sc
text:
```scala
object worksheet{
  
  // 1. sets a to an array of n random ints between 0 incl and n excl
  val n = 4
  val z = Array.ofDim[Int](n)
  val a = for elem <- z yield scala.util.Random.between(1,n)
  
  // 2. a loop that swaps adjacent elem of an array of ints
  import scala.collection.mutable.ArrayBuffer
  var b = ArrayBuffer(1, 4, -7, -5, 3) //we want ArrayBuffer(4,1,-5,-7,3)
  for (i <- 0 until b.length - 1 by 2) {
      val temp = b(i)
      b(i) = b(i+1)
      b(i+1) = temp
  }
  
  // 3 repeat previous, but produce a new array with swapped vals, using for/yield
  val b = ArrayBuffer(1, 4, -7, -5, 3)
  val c = ArrayBuffer[Int]()
  
  val c = for i <- b.indices yield {
      if (i % 2 == 0 && i + 1 < b.length) b(i+1)
      else if (i % 2 == 1) b(i - 1)
      else ()@@ 
  
      }
}
```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:11)
	dotty.tools.dotc.core.TypeOps$.dominators$1(TypeOps.scala:245)
	dotty.tools.dotc.core.TypeOps$.approximateOr$1(TypeOps.scala:381)
	dotty.tools.dotc.core.TypeOps$.orDominator(TypeOps.scala:399)
	dotty.tools.dotc.core.Types$OrType.join(Types.scala:3684)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:607)
	dotty.tools.dotc.typer.Applications.targetClass$1(Applications.scala:2498)
	dotty.tools.dotc.typer.Applications.harmonizeWith(Applications.scala:2505)
	dotty.tools.dotc.typer.Applications.harmonize(Applications.scala:2532)
	dotty.tools.dotc.typer.Applications.harmonize$(Applications.scala:434)
	dotty.tools.dotc.typer.Typer.harmonize(Typer.scala:145)
	dotty.tools.dotc.typer.Typer.$anonfun$15(Typer.scala:1499)
	dotty.tools.dotc.typer.Applications.harmonic(Applications.scala:2555)
	dotty.tools.dotc.typer.Applications.harmonic$(Applications.scala:434)
	dotty.tools.dotc.typer.Typer.harmonic(Typer.scala:145)
	dotty.tools.dotc.typer.Typer.typedIf(Typer.scala:1503)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3424)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3500)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3577)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3581)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3692)
	dotty.tools.dotc.typer.Typer.typedBlock(Typer.scala:1406)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3423)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3500)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3577)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3581)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3692)
	dotty.tools.dotc.typer.Namer.typedAheadExpr$$anonfun$1(Namer.scala:1759)
	dotty.tools.dotc.typer.Namer.typedAhead(Namer.scala:1749)
	dotty.tools.dotc.typer.Namer.typedAheadExpr(Namer.scala:1759)
	dotty.tools.dotc.typer.Namer.valOrDefDefSig(Namer.scala:1826)
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
	dotty.tools.dotc.typer.Typer.typedBlockStats(Typer.scala:1399)
	dotty.tools.dotc.typer.Typer.typedBlock(Typer.scala:1403)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3423)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3500)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3577)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3581)
	dotty.tools.dotc.typer.Typer.typedFunctionValue(Typer.scala:1883)
	dotty.tools.dotc.typer.Typer.typedFunction(Typer.scala:1622)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3425)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3500)
	dotty.tools.dotc.typer.ProtoTypes$FunProto.$anonfun$7(ProtoTypes.scala:534)
	dotty.tools.dotc.typer.ProtoTypes$FunProto.cacheTypedArg(ProtoTypes.scala:457)
	dotty.tools.dotc.typer.ProtoTypes$FunProto.typedArg(ProtoTypes.scala:535)
	dotty.tools.dotc.typer.Applications$ApplyToUntyped.typedArg(Applications.scala:998)
	dotty.tools.dotc.typer.Applications$ApplyToUntyped.typedArg(Applications.scala:998)
	dotty.tools.dotc.typer.Applications$Application.addTyped$1(Applications.scala:688)
	dotty.tools.dotc.typer.Applications$Application.matchArgs(Applications.scala:752)
	dotty.tools.dotc.typer.Applications$Application.init(Applications.scala:574)
	dotty.tools.dotc.typer.Applications$TypedApply.<init>(Applications.scala:878)
	dotty.tools.dotc.typer.Applications$ApplyToUntyped.<init>(Applications.scala:997)
	dotty.tools.dotc.typer.Applications.ApplyTo(Applications.scala:1259)
	dotty.tools.dotc.typer.Applications.ApplyTo$(Applications.scala:434)
	dotty.tools.dotc.typer.Typer.ApplyTo(Typer.scala:145)
	dotty.tools.dotc.typer.Applications.simpleApply$1(Applications.scala:1070)
	dotty.tools.dotc.typer.Applications.realApply$1$$anonfun$2(Applications.scala:1180)
	dotty.tools.dotc.typer.Typer$.tryEither(Typer.scala:118)
	dotty.tools.dotc.typer.Applications.realApply$1(Applications.scala:1195)
	dotty.tools.dotc.typer.Applications.typedApply(Applications.scala:1233)
	dotty.tools.dotc.typer.Applications.typedApply$(Applications.scala:434)
	dotty.tools.dotc.typer.Typer.typedApply(Typer.scala:145)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3415)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3500)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3466)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3500)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3577)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3581)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3692)
	dotty.tools.dotc.typer.Namer.typedAheadExpr$$anonfun$1(Namer.scala:1759)
	dotty.tools.dotc.typer.Namer.typedAhead(Namer.scala:1749)
	dotty.tools.dotc.typer.Namer.typedAheadExpr(Namer.scala:1759)
	dotty.tools.dotc.typer.Namer.typedAheadRhs$1$$anonfun$1(Namer.scala:2117)
	dotty.tools.dotc.inlines.PrepareInlineable$.dropInlineIfError(PrepareInlineable.scala:256)
	dotty.tools.dotc.typer.Namer.typedAheadRhs$1(Namer.scala:2117)
	dotty.tools.dotc.typer.Namer.rhsType$1(Namer.scala:2125)
	dotty.tools.dotc.typer.Namer.cookedRhsType$1(Namer.scala:2144)
	dotty.tools.dotc.typer.Namer.lhsType$1(Namer.scala:2145)
	dotty.tools.dotc.typer.Namer.inferredResultType(Namer.scala:2156)
	dotty.tools.dotc.typer.Namer.inferredType$1(Namer.scala:1802)
	dotty.tools.dotc.typer.Namer.valOrDefDefSig(Namer.scala:1808)
	dotty.tools.dotc.typer.Namer$Completer.typeSig(Namer.scala:823)
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
	dotty.tools.pc.SignatureHelpProvider$.signatureHelp(SignatureHelpProvider.scala:32)
	dotty.tools.pc.ScalaPresentationCompiler.signatureHelp$$anonfun$1(ScalaPresentationCompiler.scala:439)
```
#### Short summary: 

java.lang.AssertionError: assertion failed