package scala$minusimpatient$minus3e$minuscode.ch20.src.main.scala


final class section7$u002Eworksheet$_ {
def args = section7$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch20/src/main/scala/section7.worksheet.sc"""
/*<script>*/
import scala.compiletime.*
import scala.deriving.*

trait JSON[A] :
  def stringify(a: A): String

object JSON :
  given jsonDouble: JSON[Double] with
    def stringify(x: Double) = x.toString

  given jsonString: JSON[String] with
    def escape(s: String) = s.flatMap(
      Map('\\' -> "\\\\", '"' -> "\\\"", '\n' -> "\\n", '\r' -> "\\r").withDefault(_.toString))
    def stringify(s: String): String = s"\"${escape(s)}\""

  inline def summonGivenJSON[T <: Tuple]: Tuple =
    inline erasedValue[T] match
      case _: EmptyTuple => EmptyTuple
      case _: (t *: ts) => summonInline[JSON[t]] *: summonGivenJSON[ts]

  inline given jsonProduct[T](using m: Mirror.ProductOf[T]): JSON[T] =
    new JSON[T] :
      def stringify(t: T): String =
        val fieldNames = constValueTuple[m.MirroredElemLabels]
        val jsons = summonGivenJSON[m.MirroredElemTypes]
        "{ " + fieldNames.productIterator.zip(jsons.productIterator)
          .zip(t.asInstanceOf[Product].productIterator).map {
            case ((f, j), v) => s""""$f": ${j.asInstanceOf[JSON[Any]].stringify(v)}"""
          }.mkString(", ") + " }"

// We can do this for any case class, but it is repetitive
case class Person(name: String, age: Int)

given jsonPerson: JSON[Person] with  
  def stringify(p: Person) =
    val name = summon[JSON[String]].stringify(p.name)
    s"""{"name": $name, "age": $p.age}"""

summon[JSON[Person]].stringify(Person("Fred", 42))

// Automatic derivation
case class Item(description: String, price: Double)

summon[JSON[Item]].stringify(Item("Blackwell Toaster", 19.95))
  // { "description": "Blackwell Toaster", "price": 19.95 }

/*</script>*/ /*<generated>*//*</generated>*/
}

object section7$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section7$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section7$u002Eworksheet_sc.script as `section7.worksheet`

