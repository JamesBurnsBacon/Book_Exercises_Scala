package section6

import scala.concurrent.*
import scala.concurrent.duration.*
import scala.util.*
import ExecutionContext.Implicits.global
import java.sql.*

def getData1() = { Thread.sleep(1000); 19 }
def getData2() = { Thread.sleep(1000); 23 }
def persist(data: Any) = 
  Thread.sleep(1000)
  if math.random() < 0.5 then throw new SQLException()
  println(s"Persisting $data")
  data.toString.length

// Use foreach for an action with side effect
@main def demo6_1 = 
  val future1 = Future { getData1() }
  val future2 = Future { getData2() }
  val combined = for (n1 <- future1; n2 <- future2) yield n1 + n2
  combined.foreach(n => println(s"Sum: $n"))
  Thread.sleep(1100)

// The recover method lets you turn a failed future into a value
@main def demo6_2 = 
  val data = "very important data"
  val f = Future { persist(data) } recover { case e: SQLException => 0 }
  println(s"Result: ${Await.result(f, 1100.milliseconds)}")

// The failed method turns a failed future into a future delivering the exception
@main def demo6_3 = 
  val data = "very important data"
  val f = Future { persist(data) }
  for v <- f do println(s"Succeeded with $v")
  for ex <- f.failed do println(s"Failed with $ex")
  Thread.sleep(1100)

// The zipWith method lets you combine the values of two futures
@main def demo6_4 = 
  val future1 = Future { getData1() }
  val future2 = Future { getData2() }
  val combined = future1.zipWith(future2)(_ + _)
  println(s"Sum: ${Await.result(combined, 1100.milliseconds)}")
