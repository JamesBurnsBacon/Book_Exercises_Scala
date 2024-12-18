package scala$minusimpatient$minus3e$minuscode.ch13.src.main.scala


final class section1$u002Eworksheet$_ {
def args = section1$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch13/src/main/scala/section1.worksheet.sc"""
/*<script>*/
import java.awt.Color
import scala.collection.SortedSet
import scala.collection.mutable.ArrayBuffer

Iterable(0xFF, 0xFF00, 0xFF0000)
Set(Color.RED, Color.GREEN, Color.BLUE)
Map(Color.RED -> 0xFF0000, Color.GREEN -> 0xFF00, Color.BLUE -> 0xFF)
SortedSet("Hello", "World")
val coll = Seq(1, 1, 2, 3, 5, 8, 13)
val set = coll.toSet
val buffer = coll.to(ArrayBuffer)
Seq(1, 2, 3) == (1 to 3)
/*
// This does not compile
Seq(1, 2, 3) == Set(1, 2, 3)
*/
Seq(1, 2, 3).sameElements(Set(1, 2, 3))

/*</script>*/ /*<generated>*//*</generated>*/
}

object section1$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section1$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section1$u002Eworksheet_sc.script as `section1.worksheet`

