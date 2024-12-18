package cp1 :
  import java.awt.*
  class ColoredPoint(val color: Color, val point: Point) :
    def red = color.getRed()
    def green = color.getRed()
    def blue = color.getBlue()
    val x = point.x
    val y = point.y

  @main def demo =
    val cp = ColoredPoint(Color.RED, Point(3, 4))
    println(cp.x)
    println(cp.green)

package cp2 :
  import java.awt.*
  class ColoredPoint(val color: Color, val point: Point) :
    export color.{getRed as red, getGreen as green, getBlue as blue}
    export point.{x, y}

  @main def demo =
    val cp = ColoredPoint(Color.RED, Point(3, 4))
    println(cp.x)
    println(cp.green())

package cp3 :
  import java.awt.*
    class ColoredPoint(val color: Color, val point: Point) :
      export point.{setLocation as _, translate as _, toString as _, hashCode as _, equals as _, clone as _, *}

  @main def demo =
    val cp = ColoredPoint(Color.RED, Point(3, 4))
    println(cp.x)
