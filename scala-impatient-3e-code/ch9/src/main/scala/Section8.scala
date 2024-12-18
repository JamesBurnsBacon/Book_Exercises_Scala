import java.io.*
import java.net.*

@main def demo8 =
  println("Running a process")
  import scala.sys.process.*
  "ls -al ..".!

  println("Capturing process output")
  val result = "ls -al /".!!
  println(s"result: $result")

  println("Piping process output to process input")
  ("ls -al /" #| "grep u").!

  println("Sending process output to a file")
  ("ls -al /" #> File("/tmp/filelist.txt")).!

  println("Appending process output to a file")
  ("ls -al /etc" #>> File("/tmp/filelist.txt")).!
    
  println("Reading process input from a file")
  ("grep u" #< File("/tmp/filelist.txt")).!

  println("Reading process input from a URL")
  ("grep Scala" #< URL("http://horstmann.com/index.html")).!

  println("Changing working directory and environment")
  val cmd = Array("ls", "-al")
  val dirName = ".."
  val myLocale = "it_IT.UTF-8"
  val p = Process(cmd, File(dirName), ("LC_ALL", myLocale))
  p.!
