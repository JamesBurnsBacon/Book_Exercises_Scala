@main def demo4() =
  import scala.io.*
  val name = StdIn.readLine("Your name: ")
  print("Your age: ")
  val age = StdIn.readInt()
  println(s"Hello, ${name}! Next year, you will be ${age + 1}.")
