package section10

// Control Abstractions

def version1() = 
  def runInThread(block: () => Unit) =
    (new Thread :
      override def run() = block()
    ).start()

  runInThread { () => println("Hi"); Thread.sleep(10000); println("Bye") }


def version2() = 
  def runInThread(block: => Unit) =
    (new Thread :
      override def run() = block 
    ).start()

  runInThread { println("Hi"); Thread.sleep(10000); println("Bye") }

def until(condition: => Boolean)(block: => Unit): Unit =
  if !condition then
    block
    until(condition)(block)

@main def demo() = 
  version1()
  version2()  

  var x = 10
  until (x == 0) { 
    x -= 1
    println(x) 
  }

  Thread.sleep(10000)
