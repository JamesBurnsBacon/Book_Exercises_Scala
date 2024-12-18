// A type alias
object Book :
  type Index = scala.collection.mutable.HashMap[String, (Int, Int)]
  // ...

// Can use alias instead of cumbersome type
val idx = new Book.Index()

// Can give a name to a type
type Pair[T] = (T, T)
type Choices = String | Array[String]

val p: Pair[String] = ("Hello", "World")
var c: Choices = "Hello World"
c = Array("Hello", "World")

// An opaque type
import scala.collection.mutable.ArrayBuffer
object Doc :
  opaque type HTML = String
  def format(text: String): HTML = s"<p>$text</p>" // TODO: Escape &, <
  class Chapter :
    private val paragraphs = ArrayBuffer[String]()
    def paragraph(index: Int): HTML = paragraphs(index)
    def append(paragraph: HTML) = paragraphs += paragraph


// An opaque type with some methods
object Book2 :
  opaque type HTML <: CharSequence = String
  val title: HTML = "<p>Hello, World!</p>"

Book2.title.length()

// An abstract type
abstract class Reader :
  type Contents // an abstract type
  def read(filename: String): Contents
