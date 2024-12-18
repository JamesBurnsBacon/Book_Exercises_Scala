package scala$minusimpatient$minus3e$minuscode.ch18.src.main.scala


final class section9$u002Eworksheet$_ {
def args = section9$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch18/src/main/scala/section9.worksheet.sc"""
/*<script>*/
import scala.collection.mutable.ArrayBuffer

// Abstract types can have bounds

class Event
class EventSource :  
  type E <: Event
  
  type L <: Listener
  trait Listener :
    def occurred(e: E): Unit
  
  private val listeners = ArrayBuffer[L]()
  def add(l: L) = listeners += l
  def remove(l: L) = listeners -= l
  def fire(e: E) =
    for (l <- listeners) l.occurred(e)

class Button(val text: String) extends EventSource :
  class ButtonEvent(val source: Button) extends Event
  type E = ButtonEvent // OK, it's a subtype of Event 
  
  trait ButtonListener extends Listener
  type L = ButtonListener
  def click() = fire(ButtonEvent(this))

val b = Button("Click me!")  
val listener = new b.ButtonListener :
  override def occurred(e: b.ButtonEvent) = println(s"Clicked the ${e.source.text} button")
b.add(listener)
b.click()

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

