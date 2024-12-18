import scala.io.Source
import java.nio.file.*

@main def demo4 =
  val source1 = Source.fromURL("https://horstmann.com/index.html", "UTF-8")
  val source2 = Source.fromString("Hello, World!") 
    // Reads from the given string—useful for debugging
  val source3 = Source.stdin
    // Reads from standard input
  println(s"${source1.mkString.length} bytes")
  println(s"${source2.mkString.length} bytes")
  println("What is your name?")
  // Reads from standard input
  println(s"Hello, ${source3.getLines.next}")

  // Reading the bytes of a file into a byte array
  val filename = "myfile.txt"
  val bytes = Files.readAllBytes(Path.of(filename)); // An Array[Byte]
  println(bytes.take(16).toSeq)
