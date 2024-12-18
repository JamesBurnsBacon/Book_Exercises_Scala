package scala$minusimpatient$minus3e$minuscode.ch7.src.main.scala


final class section8$u002Eworksheet$_ {
def args = section8$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch7/src/main/scala/section8.worksheet.sc"""
/*<script>*/
// Imports can be in a class or block
class Employee
class Group :
  // Imports restricted to this class
  import scala.collection.mutable.*
  import com.horstmann.users.*
  val members = ArrayBuffer[User]()

/*</script>*/ /*<generated>*//*</generated>*/
}

object section8$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section8$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section8$u002Eworksheet_sc.script as `section8.worksheet`

