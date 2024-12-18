package scala$minusimpatient$minus3e$minuscode.ch3.src.main.scala


final class section5$u002Eworksheet$_ {
def args = section5$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch3/src/main/scala/section5.worksheet.sc"""
/*<script>*/
import scala.collection.mutable.ArrayBuffer
Array(1, 7, 2, 9).sum
  // 19
  // Works for ArrayBuffer too
ArrayBuffer("Mary", "had", "a", "little", "lamb").max
  // "little"
val b = ArrayBuffer(1, 7, 2, 9)
val bSorted = b.sorted 
  // b is unchanged; bSorted is ArrayBuffer(1, 2, 7, 9)
val bDescending = b.sortWith(_ > _) // ArrayBuffer(9, 7, 2, 1)
val a = Array(1, 7, 2, 9)
a.sortInPlace()
  // a is now Array(1, 2, 7, 9)
a.mkString(" and ")
  // "1 and 2 and 7 and 9"
a.mkString("<", ",", ">")
  // "<1,2,7,9>"
a.toString
  // "[I@b73e5" 
  // This is the useless toString method for arrays, straight from Java
b.toString
  // "ArrayBuffer(1, 7, 2, 9)"

/*</script>*/ /*<generated>*//*</generated>*/
}

object section5$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section5$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section5$u002Eworksheet_sc.script as `section5.worksheet`

