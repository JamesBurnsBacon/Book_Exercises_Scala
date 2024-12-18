val a = Array("Mary", "a", "had", "lamb", "little")
// java.util.Arrays.binarySearch(a, "beef") // Does not work

// Remedy:
java.util.Arrays.binarySearch(a.asInstanceOf[Array[Object]], "beef")

// As an aside, here is how to do binary search in Scala:
import scala.collection.Searching.*
val result = a.search("beef")

// Converting a Scala collection to Java:
import scala.jdk.CollectionConverters.*
import scala.collection.mutable.ArrayBuffer
val command = ArrayBuffer("ls", "-al", "/usr/bin")
val pb = ProcessBuilder(command.asJava) // Scala to Java

// Converting a Java collection to Scala:
import scala.jdk.CollectionConverters.*
import scala.collection.mutable.Buffer
val cmd: Buffer[String] = pb.command().asScala // Java to Scala
  // You can't use ArrayBuffer—the wrapped object is only guaranteed to be a Buffer

// The two-way conversion yields the original object:
cmd == command
