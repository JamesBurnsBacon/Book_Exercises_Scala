package scala$minusimpatient$minus3e$minuscode.ch3.src.main.scala


final class section2$u002Eworksheet$_ {
def args = section2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch3/src/main/scala/section2.worksheet.sc"""
/*<script>*/
import scala.collection.mutable.ArrayBuffer
val b = ArrayBuffer[Int]()
  // An empty array buffer, ready to hold integers
b += 1
  // ArrayBuffer(1)
  // Add an element at the end with +=
b ++= Array(1, 2, 3, 5, 8)
  // ArrayBuffer(1, 1, 2, 3, 5, 8)
  // You can append any collection with the ++= operator
b.dropRightInPlace(3)
  // ArrayBuffer(1, 1, 2)
  // Removes the last three elements
b.insert(2, 6)
  // ArrayBuffer(1, 1, 6, 2) 
  // Inserts before index 2
b.insertAll(2, Array(7, 8, 9))
  // ArrayBuffer(1, 1, 7, 8, 9, 6, 2)
  // Inserts the elements from another collection
b.remove(2)
  // ArrayBuffer(1, 1, 8, 9, 6, 2)
b.remove(2, 3)
  // ArrayBuffer(1, 1, 2)
  // The second parameter tells how many elements to remove
b.toArray
  // Array(1, 1, 2)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section2$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section2$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section2$u002Eworksheet_sc.script as `section2.worksheet`

