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
