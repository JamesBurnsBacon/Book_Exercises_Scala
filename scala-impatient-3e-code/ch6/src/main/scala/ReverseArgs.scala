object ReverseArgs extends App:
    if args.nonEmpty then
        println(args.reverse.mkString(" "))
    else
        println("No arguments provided.")