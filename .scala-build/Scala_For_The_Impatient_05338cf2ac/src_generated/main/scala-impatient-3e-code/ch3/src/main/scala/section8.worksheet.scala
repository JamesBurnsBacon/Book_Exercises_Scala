package scala$minusimpatient$minus3e$minuscode.ch3.src.main.scala


final class section8$u002Eworksheet$_ {
def args = section8$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch3/src/main/scala/section8.worksheet.sc"""
/*<script>*/
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

/*</script>*/ /*<generated>*//*</generated>*/
}

object section8$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section8$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section8$u002Eworksheet_sc.script as `section8.worksheet`

