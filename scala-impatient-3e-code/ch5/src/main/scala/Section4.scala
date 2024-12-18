@main def counterDemo2 =
  class Counter :
    private var value = 0
    def increment() = value += 1
    def isLess(other: Counter) = value < other.value 
      // Can access private field of other object

  val first = Counter()
  val second = Counter()
  first.increment()
  second.increment()
  second.increment()  
  println(first.isLess(second))
