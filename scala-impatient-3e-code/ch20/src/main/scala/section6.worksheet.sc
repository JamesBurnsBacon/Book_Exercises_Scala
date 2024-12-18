trait Averageable[T] :
  def add(x: T, y: T): T
  def divideBy(x: T, n: Int): T

object Averageable :
  given Averageable[Double] with
    def add(x: Double, y: Double) = x + y
    def divideBy(x: Double, n: Int) = x / n  

  given Averageable[BigDecimal] with
    def add(x: BigDecimal, y: BigDecimal) = x + y
    def divideBy(x: BigDecimal, n: Int) = x / n

def average[T : Averageable](x: T, y: T) =
  val ev = summon[Averageable[T]]
  ev.divideBy(ev.add(x, y), 2)

case class Point(x: Double, y: Double)

object Point :
  given Averageable[Point] with
    def add(p: Point, q: Point) = Point(p.x + q.x, p.y + q.y)
    def divideBy(p: Point, n: Int) = Point(p.x / n, p.y / n)

average(17.0, 29.0)

average(BigDecimal("17"), BigDecimal("29"))

average(Point(1, 7), Point(2, 9))
