import scala.collection.mutable.ArrayBuffer

Vector(1, 2, 3) :+ 5 // Yields Vector(1, 2, 3, 5)
0 +: 1 +: Vector(1, 2, 3) // Yields Vector(0, 1, 1, 2, 3)

val numberBuffer = ArrayBuffer(1, 2, 3)
numberBuffer += 5 // Adds 5 to numberBuffer
numberBuffer

var numberSet = Set(1, 2, 3)
numberSet += 5 // Sets numberSet to the immutable set numberSet + 5
var numberVector = Vector(1, 2, 3)
numberVector :+= 5 // += does not work since vectors don't have a + operator

Set(1, 2, 3) - 2 // Yields Set(1, 3)

val coll = Seq(1, 7, 2, 9)
val coll2 = Set(1, 2, 3)
coll ++ coll2
coll2 ++ coll
