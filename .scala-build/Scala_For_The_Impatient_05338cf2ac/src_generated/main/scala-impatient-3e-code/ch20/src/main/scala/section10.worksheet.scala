package scala$minusimpatient$minus3e$minuscode.ch20.src.main.scala


final class section10$u002Eworksheet$_ {
def args = section10$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch20/src/main/scala/section10.worksheet.sc"""
/*<script>*/
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

/*</script>*/ /*<generated>*//*</generated>*/
}

object section10$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section10$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section10$u002Eworksheet_sc.script as `section10.worksheet`

