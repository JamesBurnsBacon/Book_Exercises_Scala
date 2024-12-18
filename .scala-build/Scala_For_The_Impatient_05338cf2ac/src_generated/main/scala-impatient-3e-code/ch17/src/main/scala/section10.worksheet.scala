package scala$minusimpatient$minus3e$minuscode.ch17.src.main.scala


final class section10$u002Eworksheet$_ {
def args = section10$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch17/src/main/scala/section10.worksheet.sc"""
/*<script>*/
// A simple List type
abstract sealed class List[+T] :
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def toString = if isEmpty then "" else s"$head $tail" 

case class NonEmpty[T](head: T, tail: List[T]) extends List[T] :
  def isEmpty = false

case class Empty[T] extends List[T] :
  def isEmpty = true
  def head = throw UnsupportedOperationException()
  def tail = throw UnsupportedOperationException()

// Try changing the declaration of Empty to an object:
// case object Empty[T] extends List[T] : // Error

// Remedy: 
// case object Empty extends List[Nothing] :

// Now you can construct a list:
// val lst = NonEmpty(42, Empty)

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

