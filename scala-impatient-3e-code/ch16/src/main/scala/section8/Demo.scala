package section8

import scala.concurrent.*
import scala.util.*
import ExecutionContext.Implicits.global

import java.net.*
import java.net.http.*
import java.util.concurrent.Executors

def startAsyncWork(url: String, onSuccess: String => Unit, onFailure: Throwable => Unit) = 
  val executor = Executors.newCachedThreadPool();
  val client = HttpClient.newBuilder().executor(executor).build();
  val request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
  client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
    .handleAsync((result, ex) => 
      if ex == null then onSuccess(result.body()) else onFailure(ex))

def workHard(arg: Any) = 
  println("Working hard")
  Thread.sleep(1000)
  s"Worked hard on $arg"
  
def workSmart(arg: Any) =
  Thread.sleep(100)
  s"Worked smart on $arg"

@main def demo8 = 
  def computeAnswer(arg: String) = {
    val p = Promise[String]()
    def onSuccess(result: String) = p.success(result)
    def onFailure(ex: Throwable) = p.failure(ex)
    startAsyncWork(arg, onSuccess, onFailure)
    p.future
  }

  val f = computeAnswer("https://horstmann.com/index.html")
  for result <- f do println(s"Result: $result")

  Thread.sleep(3000)

  val arg = "this sample input"
  val p = Promise[String]()
  Future {
    val result = workHard(arg)
    p.trySuccess(result)
  }
  Future {
    val result = workSmart(arg)
    p.trySuccess(result)
  }

  for result <- p.future do println(s"Result: $result")

  Thread.sleep(3000)
