package scala$minusimpatient$minus3e$minuscode.ch17.src.main.scala


final class section3_3$u002Eworksheet$_ {
def args = section3_3$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch17/src/main/scala/section3_3.worksheet.sc"""
/*<script>*/
// The replaceFirst method with a lower bound

class Pair[T](val first: T, val second: T) :
  override def toString = s"($first, $second)"
  def replaceFirst[R >: T](newFirst: R) = Pair[R](newFirst, second)
  // or def replaceFirst[R >: T](newFirst: R) = Pair(newFirst, second)
  // CAUTION: This method returns a Pair[Any]
  // def replaceFirst[R](newFirst: R) = Pair(newFirst, second)

class Person(name: String) :
  override def toString = s"Person $name"
class Student(name: String, major: String) extends Person(name) :
  override def toString = s"Student $name majoring in $major"

val s1 = Student("Fred", "Marketing")
val s2 = Student("Wilma", "CS")
val p = Pair(s1, s2)
p.replaceFirst(Person("Barney"))

/*</script>*/ /*<generated>*//*</generated>*/
}

object section3_3$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section3_3$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section3_3$u002Eworksheet_sc.script as `section3_3.worksheet`

