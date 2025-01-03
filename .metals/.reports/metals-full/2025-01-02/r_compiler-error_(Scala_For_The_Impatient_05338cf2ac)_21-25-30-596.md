file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch6/src/main/scala/exercises.worksheet.sc.worksheet.sc
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition <error> is defined in
  C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch6/src/main/scala/exercises.worksheet.sc.worksheet.sc
and also in
  C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch6/src/main/scala/exercises.worksheet.sc.worksheet.sc
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1278
uri: file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch6/src/main/scala/exercises.worksheet.sc.worksheet.sc
text:
```scala
object worksheet{
  // 1 Write an object Conversions with methods inchesToCentimeters, gallonsToLiters,
  // and milesToKilometers
  object Conversions1:
      def inchesToCentimeters(inches: Double): Double = inches * 2.54
      def gallonsToLiters(gallons: Double): Double = gallons * 3.7854
      def milesToKilometers(miles: Double): Double = miles * 1.60934
  
  def demoConversions1 =
      println(Conversions1.inchesToCentimeters(12))
      println(Conversions1.gallonsToLiters(1))
      println(Conversions1.milesToKilometers(5))
  
  demoConversions1    
  
  // 2 The preceding problem wasn't very object-oriented. Provide a general superclass
  // UnitConversion and define objects InchesToCentimeters, GallonsToLiters, MilesToKilometers
  // that extend it.
  abstract class UnitConversion(val input: Double):
      def convert(value: Double): Double
  
  object InchesToCentimeters extends UnitConversion:
      override def convert(inches: Double): Double = inches * 2.54    
  
  object GallonsToLiters extends UnitConversion:
      override def convert(gallons: Double): Double = gallons * 3.7854
  
  object MilesToKilometers extends UnitConversion:
      override def convert(miles: Double): Double = miles * 1.60934 
  
  def dem@@    
  
  // 3 Define and Origin object that extends java.awt.Point - why is this actually not a good
  // idea? Have a close look at the methods of the Point class
  
  
  // 4 Define a Point class with a companion object so you can construct Point instances
  // as point(3,4) without using new
  
  
  // 5 using the App trait, print command line arguments in reverse order, separated by 
  // spaces. For example, scala Reverse Hello World should print World Hello
  
  
  // 6 an enum that describes the four playing card suits so that the toString method
  // returns ♤, ♡, ♢, or ♧
  
  
  // 7 Implement a function that checks whether a card suit value from the preceding 
  // exercise is red
  
  
  // 8 an enum that describes the eight corners of the RGB color cube. As ID's, use the
  // color values e.g. 0xff0000 for Red
}
```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition <error> is defined in
  C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch6/src/main/scala/exercises.worksheet.sc.worksheet.sc
and also in
  C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch6/src/main/scala/exercises.worksheet.sc.worksheet.sc
One of these files should be removed from the classpath.