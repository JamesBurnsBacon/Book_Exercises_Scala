package section4

import scala.concurrent.*
import ExecutionContext.Implicits.global
import scala.util.*

@main def demo4 =  
  val f = Future {
    Thread.sleep(1000)
    if scala.math.random() < 0.5 then throw Exception("Not your lucky day")
    42
  }
  f.onComplete {
    case Success(v) => println(s"The answer is $v")
    case Failure(ex) => println(ex.getMessage)
  }
  Thread.sleep(2000)
