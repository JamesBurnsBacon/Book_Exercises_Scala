package section15_1

class MilTime(val time: Int) extends AnyVal :
  def minutes = time % 100
  def hours = time / 100
  override def toString = f"$time%04d"

@main def demo =
  val lunch = MilTime(1230)
  println(lunch.hours) // OK

  // The following is an error:
  // println(lunch * 2) // Error
