import scala.compiletime.ops.int.*
import scala.compiletime.ops.any.*
import scala.deriving.*


def validate[V <: Int, P[_ <: Int] <: Boolean](using ev: P[V] =:= true, v: ValueOf[V]) = v.value

// With type lambda
validate[10, [V <: Int] =>> V % 2 == 0]

// Without type lambda
type Even[V <: Int] = V % 2 == 0
validate[10, Even]

case class Person(name: String, age: Int)
val m = summon[Mirror.Of[Person]]

type ElemTypesJSON = Tuple.Map[m.MirroredElemTypes, [X] =>> JSON[X]]
val jsons = summonAll[Tuple.Map[m.MirroredElemTypes, JSON]]
