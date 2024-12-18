@main def hello() =
  println("Hello, World!")
@main def hello2(args: String*) =
  println(s"Hello, ${args(1)}!")
@main def hello3(repetition: Int, name: String) =
  println("Hello " * repetition + name)

// If the main function always does the same things, it's ok to omit the ()
@main def hello4 =
  println("Hello, World!")
