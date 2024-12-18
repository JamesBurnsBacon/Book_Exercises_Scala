package section4
import java.io.*
import java.nio.file.*
import java.util.concurrent.*
import java.time.*
import scala.annotation.*

import scala.beans.BeanProperty

class Person :
  @BeanProperty var name = ""

@SerialVersionUID(6157032470129070425L)
class Employee extends Person, Serializable :
  @transient var lastLogin: ZonedDateTime = null
    // Becomes a transient field in the JVM
  @throws(classOf[IOException]) def save(filename: String) =     // No checked exceptions in Scala!
    val out = ObjectOutputStream(Files.newOutputStream(Path.of(filename)))
    out.writeObject(this)
    out.close()  

object Misc :
  @varargs def process(args: String*) = 
    for (arg <- args) println(s"Processing $arg...")
  @volatile var done = false // Becomes a volatile field in the JVM
  @native def win32RegKeys(root: Int, path: String): Array[String]

@main def demo4 =
  val fred = Person()
  fred.name = "Fred Flintstone"
  println(fred.name)
  // fred.getName doesn't work in Scala

  JavaDemo.main(null) // Launch the Java program
