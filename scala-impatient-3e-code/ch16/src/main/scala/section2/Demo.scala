package section2

import scala.concurrent.*
import ExecutionContext.Implicits.global

@main def demo2 =
  // You can use a blocking wait to get a Future's result
  import scala.concurrent.duration.*
  val f = Future { Thread.sleep(10000); 42 } 
  val result = Await.result(f, 10.seconds)
  println(result)

  // Use ready to avoid exceptions:
  val f2 = Future {
    Thread.sleep((10000 * scala.math.random()).toLong)
    if scala.math.random() < 0.5 then throw Exception("Not your lucky day")
    42
  }
  val result2 = Await.ready(f2, 5.seconds).value
  println(result2)
