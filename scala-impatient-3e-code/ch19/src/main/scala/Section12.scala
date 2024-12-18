import java.net.URI
import java.util.concurrent.Executors
import scala.concurrent.{ExecutionContext, Future, blocking}
import scala.io.Source
import scala.util.{Try, Success, Failure}

val pool = Executors.newCachedThreadPool()
given ExecutionContext = ExecutionContext.fromExecutor(pool)

@main def getDemo1 =
  type ContextualFuture[T] = ExecutionContext ?=> Future[T]

  def GET(url: String): ContextualFuture[String] = 
    Future {
      blocking {
        Source.fromURL(url).mkString
      }
    }

  GET("https://horstmann.com/index.html").onComplete {
    case Success(res) => println(res.substring(0, 300) + "...")
    case Failure(ex) => println(ex.getMessage)
  }

object Requests :
  class ResponseWrapper(val response: String)  
  def res(using wrapper: ResponseWrapper): String = wrapper.response

  def GET(url: String)(handler: ResponseWrapper ?=> Unit) = 
    Future {
      blocking {
        val response = Source.fromURL(url).mkString
        handler(using ResponseWrapper(response))
      }
    }

@main def getDemo2 =
  import Requests.{GET, res}
  GET("https://horstmann.com/index.html") { println(res.substring(0, 300) + "...") }
