package section5

import scala.concurrent.*
import scala.concurrent.duration.*
import scala.io.*
import scala.util.*
import ExecutionContext.Implicits.global

def getData1() = { Thread.sleep(1000); 19 }
def getData2() = { Thread.sleep(1000); 23 }
def getData() = 
  Thread.sleep(1000)
  if math.random() < 0.5 then 19 else 23
def getMoreData(arg: Int) = { Thread.sleep(1000); 42 - arg }

// Composing with onComplete is tedious
@main def demo5_1 = 
  val future1 = Future { getData1() }
  val future2 = Future { getData2() }
  
  future1 onComplete {
    case Success(n1) =>
      future2 onComplete {
        case Success(n2) => {
          val n = n1 + n2
          println(s"Sum: $n")
        }
        case Failure(ex) => ex.printStackTrace()
      }
    case Failure(ex) => ex.printStackTrace()
  }
  Thread.sleep(1100)

// Using map with futures--first attempt
@main def demo5_2 = 
  val future1 = Future { getData1() }
  val combined = future1.map(n1 => n1 + getData2())
  println(s"Sum: ${Await.result(combined, 2200.milliseconds)}")

// Using map with futures--both calculations concurrent
@main def demo5_3 = 
  val future1 = Future { getData1() }
  val future2 = Future { getData2() }
  val combined = future1.map(n1 => future2.map(n2 => n1 + n2))
  println(s"Sum: ${Await.result(combined, 1100.milliseconds)}")

// Yikes--that was a Future[Future[Int]]. Use flatMap instead
@main def demo5_4 = 
  val future1 = Future { getData1() }
  val future2 = Future { getData2() }
  val combined = future1.flatMap(n1 => future2.map(n2 => n1 + n2))
  println(s"Sum: ${Await.result(combined, 1100.milliseconds)}")

// Looks much nicer as a for comprehension
@main def demo5_5 = 
  val future1 = Future { getData1() }
  val future2 = Future { getData2() }
  val combined = for n1 <- future1; n2 <- future2 yield n1 + n2
  println(s"Sum: ${Await.result(combined, 1100.milliseconds)}")

// Can also have guards
@main def demo5_6 = 
  val future1 = Future { getData() }
  val future2 = Future { getData() }
  val combined =
    for n1 <- future1; n2 <- future2 if n1 != n2 yield n1 + n2
  println(s"Sum: ${Await.result(combined, 1100.milliseconds)}")

// Use def to delay start of an asynchronous computation
@main def demo5_7 = 
  val future1 = Future { getData1() } 
  def future2 = Future { getData2() } // def, not val
  val combined = for (n1 <- future1; n2 <- future2) yield n1 + n2
  println(s"Sum: ${Await.result(combined, 2200.milliseconds)}")

// Useful if the second step depends on the outcome of the first
@main def demo5_8 = 
  def future1 = Future { getData() }
  def future2(arg: Int) = Future { getMoreData(arg) }
  val combined = for (n1 <- future1; n2 <- future2(n1)) yield n1 + n2
  println(s"Sum: ${Await.result(combined, 2200.milliseconds)}")

// Can also compose Try-valued computations
// Try with both good and bad inputs
@main def demo5_9 = 
  def readInt(prompt: String) = Try(StdIn.readLine(s"$prompt: ").toInt)
  val combined = for (n1 <- readInt("n1"); n2 <- readInt("n2")) yield n1 + n2
  println(combined)
