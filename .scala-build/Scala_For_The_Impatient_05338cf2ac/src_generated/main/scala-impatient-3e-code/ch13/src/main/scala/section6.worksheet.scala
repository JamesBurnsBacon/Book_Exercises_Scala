package scala$minusimpatient$minus3e$minuscode.ch13.src.main.scala


final class section6$u002Eworksheet$_ {
def args = section6$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch13/src/main/scala/section6.worksheet.sc"""
/*<script>*/
import scala.collection.mutable.ArrayBuffer

Vector(1, 2, 3) :+ 5 // Yields Vector(1, 2, 3, 5)
0 +: 1 +: Vector(1, 2, 3) // Yields Vector(0, 1, 1, 2, 3)

val numberBuffer = ArrayBuffer(1, 2, 3)
numberBuffer += 5 // Adds 5 to numberBuffer
numberBuffer

var numberSet = Set(1, 2, 3)
numberSet += 5 // Sets numberSet to the immutable set numberSet + 5
var numberVector = Vector(1, 2, 3)
numberVector :+= 5 // += does not work since vectors don't have a + operator

Set(1, 2, 3) - 2 // Yields Set(1, 3)

val coll = Seq(1, 7, 2, 9)
val coll2 = Set(1, 2, 3)
coll ++ coll2
coll2 ++ coll

/*</script>*/ /*<generated>*//*</generated>*/
}

object section6$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section6$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section6$u002Eworksheet_sc.script as `section6.worksheet`

