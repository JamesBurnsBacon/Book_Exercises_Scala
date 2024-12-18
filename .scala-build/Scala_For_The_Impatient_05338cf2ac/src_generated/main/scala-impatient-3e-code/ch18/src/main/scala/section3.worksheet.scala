package scala$minusimpatient$minus3e$minuscode.ch18.src.main.scala


final class section3$u002Eworksheet$_ {
def args = section3$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch18/src/main/scala/section3.worksheet.sc"""
/*<script>*/
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

/*</script>*/ /*<generated>*//*</generated>*/
}

object section3$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section3$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section3$u002Eworksheet_sc.script as `section3.worksheet`

