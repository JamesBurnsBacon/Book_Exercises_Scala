package section9

import scala.concurrent.*
import scala.io.*
import scala.util.*
import ExecutionContext.Implicits.global
import java.util.concurrent.Executors

@main def demo9_1 = 
  val f = Future {
    val url = "https://horstmann.com/index.html"
    blocking {
      val contents = Source.fromURL(url).mkString
      if contents.length < 300
      then contents
      else contents.substring(0, 300) + "…"
    }
  }

  for result <- f do println(s"Result: $result")

  Thread.sleep(1000)

@main def demo9_2 = 
  val pool = Executors.newCachedThreadPool()
  given ExecutionContext = ExecutionContext.fromExecutor(pool)
  val f = Future {
    val url = "https://horstmann.com/index.html"
    blocking {
      val contents = Source.fromURL(url).mkString
      contents.substring(0, 300) + "…"
    }
  }

  println(pool)

  for result <- f do println(s"Result: $result")

  Thread.sleep(10000)
  pool.shutdown()
