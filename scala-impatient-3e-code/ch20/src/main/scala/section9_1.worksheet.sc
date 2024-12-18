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

  inline def summonGiven[T <: Tuple, C[_]]: Tuple =
    inline erasedValue[T] match
      case _: EmptyTuple => EmptyTuple
      case _: (t *: ts) => summonInline[C[t]] *: summonGiven[ts, C]

  inline given jsonProduct[T](using m: Mirror.ProductOf[T]): JSON[T] =
    new JSON[T]:
      def stringify(t: T): String =
        val fieldNames = constValueTuple[m.MirroredElemLabels]
        val jsons = summonGiven[m.MirroredElemTypes, JSON]
        "{ " + fieldNames.productIterator.zip(jsons.productIterator)
          .zip(t.asInstanceOf[Product].productIterator).map {
            case ((f, j), v) => s""""$f": ${j.asInstanceOf[JSON[Any]].stringify(v)}"""
          }.mkString(", ") + " }"

case class Item(description: String, price: Double)

summon[JSON[Item]].stringify(Item("Blackwell Toaster", 19.95))
  // { "description": "Blackwell Toaster", "price": 19.95 }
