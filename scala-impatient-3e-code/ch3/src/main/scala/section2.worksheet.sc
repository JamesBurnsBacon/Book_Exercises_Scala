import scala.collection.mutable.ArrayBuffer
val b = ArrayBuffer[Int]()
  // An empty array buffer, ready to hold integers
b += 1
  // ArrayBuffer(1)
  // Add an element at the end with +=
b ++= Array(1, 2, 3, 5, 8)
  // ArrayBuffer(1, 1, 2, 3, 5, 8)
  // You can append any collection with the ++= operator
b.dropRightInPlace(3)
  // ArrayBuffer(1, 1, 2)
  // Removes the last three elements
b.insert(2, 6)
  // ArrayBuffer(1, 1, 6, 2) 
  // Inserts before index 2
b.insertAll(2, Array(7, 8, 9))
  // ArrayBuffer(1, 1, 7, 8, 9, 6, 2)
  // Inserts the elements from another collection
b.remove(2)
  // ArrayBuffer(1, 1, 8, 9, 6, 2)
b.remove(2, 3)
  // ArrayBuffer(1, 1, 2)
  // The second parameter tells how many elements to remove
b.toArray
  // Array(1, 1, 2)
