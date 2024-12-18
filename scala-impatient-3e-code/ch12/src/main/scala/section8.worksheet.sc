// Currying

val mul = (x: Int, y: Int) => x * y
val mulOneAtATime = (x: Int) => ((y: Int) => x * y)
mulOneAtATime(6)(7)
def divOneAtATime(x: Int)(y: Int) = x / y
val a = Array("Mary", "had", "a", "little", "lamb")
val b = Array(4, 3, 1, 6, 5)
a.corresponds(b)(_.length == _)
