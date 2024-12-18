package section15_2

class MilTime private(val time: Int) extends AnyVal :
  def minutes = time % 100
  def hours = time / 100
  override def toString = f"$time%04d"

object MilTime :
  def apply(t: Int) = 
    if 0 <= t && t < 2400 && t % 100 < 60 then MilTime(t)
    else throw IllegalArgumentException()

@main def demo =
  // Try an invalid value such as 3230 to see the exception
  val lunch = MilTime(1230)
  println(lunch.hours) // OK
