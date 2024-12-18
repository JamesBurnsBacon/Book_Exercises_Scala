import java.nio.file.*
def process(p: Path) = println(p)

import java.nio.file.*
import scala.jdk.StreamConverters.*
val dirname = "/home"
val entries = Files.list(Paths.get(dirname)) // or Files.walk 
try  
  for p <- entries.toScala(Iterator) do
    process(p)
finally
  entries.close()
