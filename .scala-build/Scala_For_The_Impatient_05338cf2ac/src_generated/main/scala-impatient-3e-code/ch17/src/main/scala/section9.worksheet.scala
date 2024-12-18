package scala$minusimpatient$minus3e$minuscode.ch17.src.main.scala


final class section9$u002Eworksheet$_ {
def args = section9$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch17/src/main/scala/section9.worksheet.sc"""
/*<script>*/
// Arrays are not covariant
/*
val students = Array[Student](length)
val people: Array[Person] = students // Not legal, but suppose it was*/

// Arrays are not contravariant either
/*
val people = Array[Person](length)
val students: Array[Student] = people // Not legal, but suppose it was*/

// Defining a covariant mutable pair doesn't work
/*
class Pair[+T](var first: T, var second: T) // Error
*/

// This method is safe, but it violates the variance position rule
/*
class Pair[+T](val first: T, val second: T) :
  def replaceFirst(newFirst: T) = Pair[T](newFirst, second) // Error
*/

// Remedy: Add a type parameter
class Pair[+T](val first: T, val second: T) :
  override def toString = s"($first, $second)"
  def replaceFirst[R >: T](newFirst: R) = Pair[R](newFirst, second)

val p = Pair("Fred", "Brooks")
p.replaceFirst("Wilma")

/*</script>*/ /*<generated>*//*</generated>*/
}

object section9$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section9$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section9$u002Eworksheet_sc.script as `section9.worksheet`

