class Counter : 
  private var value = 0 // You must initialize the field
  def increment() = // Methods are public by default
    value += 1 
  def current = value

// Use backticks around symbolic names
class `⏰` :
  def now() = java.time.LocalTime.now()
  
@main def counterDemo =
  val myCounter = Counter() // Or new Counter()
  myCounter.increment() 
  println(myCounter.current)

@main def clockDemo =
  println(⏰().now())
