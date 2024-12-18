package scala$minusimpatient$minus3e$minuscode.ch6.src.main.scala


final class section3$u002Eworksheet$_ {
def args = section3$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch6/src/main/scala/section3.worksheet.sc"""
/*<script>*/
abstract class UndoableAction(val description: String) :
  def undo(): Unit
  def redo(): Unit

object DoNothingAction extends UndoableAction("Do nothing") :
  override def undo() = ()
  override def redo() = ()

val actions = Map("open" -> DoNothingAction, "save" -> DoNothingAction)
  // Open and save not yet implemented

actions("open").description
actions("open") == actions("save")

/*</script>*/ /*<generated>*//*</generated>*/
}

object section3$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section3$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section3$u002Eworksheet_sc.script as `section3.worksheet`

