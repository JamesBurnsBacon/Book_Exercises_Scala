package scala$minusimpatient$minus3e$minuscode.ch17.src.main.scala


final class section8_1$u002Eworksheet$_ {
def args = section8_1$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch17/src/main/scala/section8_1.worksheet.sc"""
/*<script>*/
class Person(name: String) :
  override def toString = s"Person $name"
class Student(name: String, major: String) extends Person(name) :
  override def toString = s"Student $name majoring in $major"

// This type is covariant. See what happens if you remove the +
class Pair[+T](val first: T, val second: T)

def makeFriends(p: Pair[Person]) = s"$first and $second are now friends"

val fred = Student("Fred", "Marketing")
val wilma = Student("Wilma", "CS")
val p = Pair(fred, wilma)

makeFriends(p)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section8_1$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section8_1$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section8_1$u002Eworksheet_sc.script as `section8_1.worksheet`

