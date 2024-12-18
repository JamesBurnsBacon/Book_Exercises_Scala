// A generic function with a type parameter
def getMiddle[T](a: Array[T]) = a(a.length / 2)
// The type parameter is inferred
getMiddle(Array("Mary", "had", "a", "little", "lamb")) // Calls getMiddle[String]
// You can specify the type parameter explicitly
val f = getMiddle[String] // The function, saved in f
