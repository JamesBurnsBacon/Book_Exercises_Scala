import scala.math.sqrt
import scala.reflect.ClassTag

trait Iterator[E] {
  def next(): E
  def hasNext: Boolean
}

trait Container[E : ClassTag] :
  def +=(e: E): Unit

trait Iterable[E, C[X] <: Container[X]] :
  def build[F : ClassTag](): C[F]  
  def iterator(): Iterator[E]
  def map[F : ClassTag](f : E => F) : C[F] =
    val res = build[F]()
    val iter = iterator()
    while iter.hasNext do
      res += f(iter.next())
    res

class Buffer[E : ClassTag] extends Iterable[E, Buffer] with Container[E] :
  private var capacity = 10
  private var length = 0
  private var elems = Array[E](capacity) // See note

  def iterator() = new Iterator[E] :
    private var i = 0
    def hasNext = i < length
    def next() = { i += 1; elems(i - 1) }
  
  def build[F : ClassTag]() = Buffer[F]

  def +=(e: E) =
    if length == capacity then
      capacity = 2 * capacity
      val nelems = Array[E](capacity) // See note
      for (i <- 0 until length) nelems(i) = elems(i)
      elems = nelems    
    elems(length) = e
    length += 1

// An iterable, but not a container

class Range(val low: Int, val high: Int) extends Iterable[Int, Buffer] :
  def iterator() = new Iterator[Int] :
    private var i = low
    def hasNext = i <= high
    def next() = { i += 1; i - 1 }
    
  def build[F : ClassTag]() = Buffer[F]

@main def higherKindDemo =
  val names = new Buffer[String]
  names += "Fred"
  names += "Linda"
  val lengths = names.map(_.length)
  lengths.map(println(_))
  new Range(1, 10).map(sqrt(_)).map(println(_))
