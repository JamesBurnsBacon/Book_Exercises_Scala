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

  inline given jsonSum[T](using m: Mirror.SumOf[T]): JSON[T] = 
    new JSON[T] :
      def stringify(t: T): String = 
        val index = m.ordinal(t)
        val jsons = summonGivenJSON[m.MirroredElemTypes]
        jsons.productElement(index).asInstanceOf[JSON[Any]].stringify(t)

  inline def derived[T](using m: Mirror.Of[T]): JSON[T] =
    inline m match
      case s: Mirror.SumOf[T] => jsonSum(using s)
      case p: Mirror.ProductOf[T] => jsonProduct(using p)

sealed abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount

enum BinaryTree[+A] derives JSON : 
  case Node(value: A, left: BinaryTree[A], right: BinaryTree[A])
  case Empty

summon[JSON[Amount]].stringify(Dollar(19.95))
summon[JSON[Amount]].stringify(Currency(19.95, "CHF"))

summon[JSON[BinaryTree[String]]].stringify(
  BinaryTree.Node("Bravo",
    BinaryTree.Node("Alpha", BinaryTree.Empty, BinaryTree.Empty),
    BinaryTree.Node("Charlie", BinaryTree.Empty, BinaryTree.Empty)))
