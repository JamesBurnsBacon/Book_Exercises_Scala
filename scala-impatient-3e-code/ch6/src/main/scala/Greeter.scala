@main def hello(args: String*) =
  println(s"Hello, ${args.mkString(" ")}!")
