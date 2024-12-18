package scala$minusimpatient$minus3e$minuscode.ch10.src.main.scala


final class section14$u002Eworksheet$_ {
def args = section14$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch10/src/main/scala/section14.worksheet.sc"""
/*<script>*/
// A transparent trait is not used for type inference
// Note that Serializable is not inferred for p

class Person
class Employee extends Person, Serializable, Cloneable
class Contractor extends Person, Serializable, Cloneable
val p = if scala.math.random() < 0.5 then Employee() else Contractor()
p

// Here is how to declare your own transparent trait

transparent trait Logged

class Event
class ActionEvent extends Logged
class ChangeEvent extends Logged

// Note that Logged is not inferred for e
val e = if Math.random() < 0.5 then ActionEvent else ChangeEvent
e

/*</script>*/ /*<generated>*//*</generated>*/
}

object section14$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section14$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section14$u002Eworksheet_sc.script as `section14.worksheet`

