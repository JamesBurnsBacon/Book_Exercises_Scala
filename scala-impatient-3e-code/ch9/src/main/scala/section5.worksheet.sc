import java.io.*

val filename = "/tmp/numbers.txt"
val out = PrintWriter(filename)
for i <- 1 to 100 do out.println(i)
val quantity = 10
val price = 29.95
out.printf("%6d %10.2f%n", quantity, price)
out.close()
scala.io.Source.fromFile(filename).mkString
