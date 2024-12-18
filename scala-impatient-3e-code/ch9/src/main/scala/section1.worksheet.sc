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
