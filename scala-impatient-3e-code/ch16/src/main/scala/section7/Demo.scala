package section7

import scala.concurrent.*
import scala.concurrent.duration.*
import scala.util.*
import ExecutionContext.Implicits.global


def process(numbers: Seq[Int]) = { Thread.sleep(1000); numbers.sum }

def isPrime(n: Int) = { Thread.sleep(1); BigInt(n).isProbablePrime(64) }

// The sequence method turns a collection of futures into a future of the collection
@main def demo7_1 = 
  val inputs = 1.to(100_000).toSeq
  val parts = inputs.grouped(1000)
  val futures = parts.map(part => Future { process(part) })
  val result = Future.sequence(futures);
  println(s"result: ${Await.result(result, 1100.milliseconds)}")

// The traverse method yields a future to all results  
@main def demo7_2 = 
  val inputs = 1.to(10_000)
  val parts = inputs.grouped(1000).toSeq
  val result = Future.traverse(parts)(p => Future { process(p) })
  println(s"result: ${Await.result(result, 5.seconds)}")

// The reduceLeft method operates on an iterable of futures
@main def demo7_3 = 
  val inputs = 1.to(10_000)
  val parts = inputs.grouped(1000).toSeq
  val futures = parts.map(part => Future { process(part) })
  val result = Future.reduceLeft(futures)(_ + _)
    // Yields a future to the sum of the results of all futures
  println(s"result: ${Await.result(result, 5000.milliseconds)}")
  
// The firstCompletedOf method yields the first completed result or failure
@main def demo7_4 = 
  val inputs = 1.to(100_000)
  val parts = inputs.grouped(1000).toSeq
  val futures = parts.map(part => Future { part.find(n => isPrime(n) && n.toString.contains("666")) })
  val result = Future.firstCompletedOf(futures)
   println(s"result: ${Await.result(result, 10.seconds)}")

// The find method is similar, but it filters the returned result with a predicate
@main def demo7_5 = 
  val inputs = 1.to(100_000)
  val parts = inputs.grouped(1000).toSeq
  val futures = parts.map(part => Future { part.find(isPrime) })
  def predicate(n: Option[Int]) = n match 
    case Some(i) => i.toString.contains("666")
    case None => false
  val result = Future.find(futures)(predicate)
    // Yields a Future[Option[T]]
  println(s"result: ${Await.result(result, 10.seconds)}")

// The delegate method runs a future-producing function and flattens the result
@main def demo7_6 =
  val inputs = 1.to(100_000)
  def getData() = process(inputs)
  def future1 = Future { getData() } // Note def, not val
  val result = Future.delegate(future1) // A Future[T], not a Future[Future[T]]
  println(s"result: ${Await.result(result, 10.seconds)}")
