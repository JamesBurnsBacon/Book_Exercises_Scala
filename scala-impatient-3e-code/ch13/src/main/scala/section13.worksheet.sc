import java.nio.file.*
import scala.collection.mutable.Buffer
import scala.jdk.CollectionConverters.*
val props = System.getProperties.asScala
props("com.horstmann.scala") = "impatient"
props
import scala.jdk.StreamConverters.*
val filename = "/usr/share/dict/words"
val lineBuffer = Files.lines(Path.of(filename)).toScala(Buffer)
