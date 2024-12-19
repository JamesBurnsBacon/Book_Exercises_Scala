file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.sc
### scala.MatchError: TypeDef(<error>,TypeBoundsTree(EmptyTree,EmptyTree,EmptyTree)) (of class dotty.tools.dotc.ast.Trees$TypeDef)

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 490
uri: file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.sc
text:
```scala
object worksheet{
  // 1 prints the message on the first line, and empty parentheses on the second line
  //It prints the parentheses as if literal
  println(println("Hello"))
  
  // 2 value and type of empty block expression {}, has only the absence of meaningful data
  type {} //Unit
   
  // 3  assignment where x = y = 1 is valid
  var i: Any = 0
  var j = 0
  
  i = j = 1 // Does not set i to 1
  
  // 4 Scala loop from Java syntax: for(int i = 10, i >= 0; i--)System.@@ 
  
  
}
```



#### Error stacktrace:

```
dotty.tools.pc.completions.KeywordsCompletions$.checkTemplateForNewParents$$anonfun$2(KeywordsCompletions.scala:218)
	scala.Option.map(Option.scala:242)
	dotty.tools.pc.completions.KeywordsCompletions$.checkTemplateForNewParents(KeywordsCompletions.scala:215)
	dotty.tools.pc.completions.KeywordsCompletions$.contribute(KeywordsCompletions.scala:44)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:134)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:93)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:154)
```
#### Short summary: 

scala.MatchError: TypeDef(<error>,TypeBoundsTree(EmptyTree,EmptyTree,EmptyTree)) (of class dotty.tools.dotc.ast.Trees$TypeDef)