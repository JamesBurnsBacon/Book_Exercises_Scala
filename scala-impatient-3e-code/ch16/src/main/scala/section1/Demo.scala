package section1

@main def demo1 =
  // The code in a Future executes sometime in the future
  import java.time.*
  import scala.concurrent.*
  given ExecutionContext = ExecutionContext.global
  
  Future {
    Thread.sleep(10000)
    println(s"This is the future at ${LocalTime.now}")
  }
  println(s"This is the present at ${LocalTime.now}")
  Thread.sleep(11000)

  // Futures execute concurrently
  Future { for (i <- 1 to 100) { print("A"); Thread.sleep(10) } }
  Future { for (i <- 1 to 100) { print("B"); Thread.sleep(10) } }
  println()

  // A future produces a result or an exception
  val f = Future {
    Thread.sleep(10000)
    42
  }
  println(f)
  Thread.sleep(11000)
  println(f)
  val f2 = Future {
    if LocalTime.now.getMinute != 42 then
      throw Exception("not a good time")
    42
  }
  Thread.sleep(1000)
  println(f2)
