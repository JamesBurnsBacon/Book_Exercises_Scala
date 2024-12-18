// Closures

def mulBy(factor : Double) = (x : Double) => factor * x
val triple = mulBy(3)
val half = mulBy(0.5)
println(s"${triple(14)} ${half(14)}") // Prints 42 7
