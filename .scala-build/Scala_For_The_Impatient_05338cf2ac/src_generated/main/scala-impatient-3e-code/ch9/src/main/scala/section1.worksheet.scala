package scala$minusimpatient$minus3e$minuscode.ch9.src.main.scala


final class section1$u002Eworksheet$_ {
def args = section1$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch9/src/main/scala/section1.worksheet.sc"""
/*<script>*/
def process(s: String) = println(s"Processing $s")

import scala.io.Source
val filename = "/usr/share/dict/words"
var source = Source.fromFile(filename, "UTF-8")
  // You can omit the encoding if you know that the file uses
  // the default platform encoding
var lineIterator = source.getLines
for l <- lineIterator do
  process(l)
source.close()

source = Source.fromFile(filename, "UTF-8")
val lines = source.getLines.toArray
source.close()

source = Source.fromFile(filename, "UTF-8")
var contents = source.mkString
source.close()

import java.nio.file.{Files,Path}
import java.nio.charset.StandardCharsets.UTF_8
contents = Files.readString(Path.of(filename), UTF_8)
contents

import scala.collection.mutable.Buffer
import scala.jdk.StreamConverters.*
val lineBuffer = Files.lines(Path.of(filename), UTF_8).toScala(Buffer)
lineIterator = Files.lines(Path.of(filename), UTF_8).toScala(Iterator)
for (l <- lineIterator) process(l)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section1$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section1$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section1$u002Eworksheet_sc.script as `section1.worksheet`

