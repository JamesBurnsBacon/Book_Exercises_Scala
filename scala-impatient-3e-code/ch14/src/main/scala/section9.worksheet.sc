// A pattern can be used to declare variables in "for" expressions

import scala.jdk.CollectionConverters.*
  // Converts Java Properties to a Scala map—just to get an interesting example
for (k, v) <- System.getProperties.asScala do
  println(s"$k -> $v")

// Use "for case" to skip match errors

for case (k, "UTF-8") <- System.getProperties.asScala
  yield k

// A guard comes at the end

for (k, v) <- System.getProperties.asScala if v == "UTF-8"
  yield k
