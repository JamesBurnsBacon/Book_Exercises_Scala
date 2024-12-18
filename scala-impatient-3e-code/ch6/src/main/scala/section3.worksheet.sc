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
