// Default arguments:
def decorate(str: String, left: String = "[", right: String = "]") =
  left + str + right
decorate("Hello", "<<<", ">>>")
decorate("Hello", ">>>[")
decorate(left = "<<<", str = "Hello", right = ">>>")
decorate("Hello", right = "]<<<") // Calls decorate("Hello", "[", "]<<<")

// Variable number of arguments:
def sum(args: Int*) = 
  var result = 0
  for arg <- args do result += arg
  result
sum(1, 4, 9, 16, 25)

// This is an error:
// sum(1 to 5) // Error

// Remedy:
sum((1 to 5)*) // Consider 1 to 5 as an argument sequence

// The * syntax is needed in recursive functions:
def recursiveSum(args: Int*) : Int = 
  if args.length == 0 then 0 
  else args.head + recursiveSum(args.tail*)
recursiveSum(1, 4, 9, 16, 25)
