package scala$minusimpatient$minus3e$minuscode.ch6.src.main.scala


final class exercises$u002Eworksheet$u002Esc$u002Eworksheet$_ {
def args = exercises$u002Eworksheet$u002Esc$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch6/src/main/scala/exercises.worksheet.sc.worksheet.sc"""
/*<script>*/
// 1 Write an object Conversions with methods inchesToCentimeters, gallonsToLiters,
import org.w3c.dom.css.RGBColor
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
abstract class UnitConversion2:
    def convert(value: Double): Double

object InchesToCentimeters extends UnitConversion2:
    override def convert(inches: Double): Double = inches * 2.54    

object GallonsToLiters extends UnitConversion2:
    override def convert(gallons: Double): Double = gallons * 3.7854

object MilesToKilometers extends UnitConversion2:
    override def convert(miles: Double): Double = miles * 1.60934 

def demoConversions2 = 
    println(InchesToCentimeters.convert(12))
    println(GallonsToLiters.convert(1))
    println(MilesToKilometers.convert(5))

demoConversions2    

// 3 Define an Origin object that extends java.awt.Point - why is this actually not a good
// idea? Have a close look at the methods of the Point class
//this allows the concept of the origin, that should be immutable, to be modified
import java.awt.Point

object Origin extends Point(0,0)

def demoOrigin =
    print(Origin)
    Origin.setLocation(10,20)
    print(Origin)

demoOrigin
// 4 Define a Point class with a companion object so you can construct Point instances
// as point(3,4) without using new
class Point4(val x: Int, val y: Int):
    override def toString: String = s"Point($x,$y)"

object Point4:
    def apply(x: Int, y: Int): Point4 = new Point4(x,y)

def demoPoint4 =
    val p1 = Point(6,9)
    println(p1)

demoPoint4    

// 5 using the App trait, print command line arguments in reverse order, separated by 
// spaces. For example, scala Reverse Hello World should print World Hello
// Not sure about this one
// See ReverseArgs.scala

// 6 an enum that describes the four playing card suits so that the toString method
// returns ♤, ♡, ♢, or ♧ ... toString is overriden
enum CardSuits(val name: String, val symbol: String):
    case Spades extends CardSuits("Spades", "♤")
    case Hearts extends CardSuits("Hearts", "♡")
    case Diamonds extends CardSuits("Diamonds", "♢")
    case Clubs extends CardSuits("Clubs", "♧")

    override def toString: String = s"$name ($symbol)"

def cardSuitsDemo =
    println(CardSuits.Hearts)

cardSuitsDemo    

// 7 Implement a function that checks whether a card suit value from the preceding 
// exercise is red
enum CardSuits7(val name: String, val symbol: String, val isRed: Boolean):
    case Spades extends CardSuits7("Spades", "♤", false)
    case Hearts extends CardSuits7("Hearts", "♡", true)
    case Diamonds extends CardSuits7("Diamonds", "♢", true)
    case Clubs extends CardSuits7("Clubs", "♧", false)

    override def toString: String = s"$name ($symbol)" 

def isRed7(suit: CardSuits7): Boolean = suit.isRed

def isRedDemo7: Unit =
    println(isRed7(CardSuits7.Spades))
    println(isRed7(CardSuits7.Hearts))    

isRedDemo7          

// 8 an enum that describes the eight corners of the RGB color cube. As ID's, use the
// color values e.g. 0xff0000 for Red
enum RGBColorCube(val colorValue: Int):
    case Red extends RGBColorCube(0xff0000)
    case Green extends RGBColorCube(0x00ff00)
    case Blue extends RGBColorCube(0x0000ff)
    case Yellow extends RGBColorCube(0xffff00)
    case Magenta extends RGBColorCube(0xff00ff)
    case Cyan extends RGBColorCube(0x00ffff)
    case White extends RGBColorCube(0xffffff)
    case Black extends RGBColorCube(0x000000)

    override def toString: String = f"Color(0x${colorValue.toHexString})"

def colorDemo8: Unit = RGBColorCube.values.foreach(println)

colorDemo8
/*</script>*/ /*<generated>*//*</generated>*/
}

object exercises$u002Eworksheet$u002Esc$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new exercises$u002Eworksheet$u002Esc$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export exercises$u002Eworksheet$u002Esc$u002Eworksheet_sc.script as `exercises.worksheet.sc.worksheet`

