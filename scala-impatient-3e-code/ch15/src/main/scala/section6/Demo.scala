package section6
import scala.annotation.{unchecked as _, _}
import scala.annotation.unchecked.*

@deprecated(message = "Use factorial(n: BigInt) instead")
def factorial(n: Int): Int =   if n <= 1 then 1 else n * factorial(n - 1)

@deprecatedInheritance class Person :
  var name: String = ""
  @deprecatedOverriding override def toString = s"A person named $name"

class Employee extends Person : // Deprecation warning
  override def toString = s"An employee named ${name}" // Deprecation warning

// No compiler warning about variance
trait Comparator[-T] extends
  java.util.Comparator[T @uncheckedVariance]

@main def demo6 = 
  println(factorial(10)) // Deprecation warning
  import scala.jdk.CollectionConverters.*
  val lst = System.getProperties.asScala.keys.toList
  // No compiler warning about missing case
  val result = 
    (lst: @unchecked) match
      case head :: tail => s"First key $head, ${tail.length} more"
  println(result)
  val myThread = new Thread(() => 
    for (i <- 1 to 1000) println(i))
  myThread.start()
  myThread.stop() : @nowarn("cat=deprecation") // Silences the deprecation category
