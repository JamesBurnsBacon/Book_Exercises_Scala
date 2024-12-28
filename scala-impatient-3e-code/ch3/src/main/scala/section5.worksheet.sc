import scala.collection.mutable.ArrayBuffer
Array(1, 7, 2, 9).sum
  // 19
  // Works for ArrayBuffer too
ArrayBuffer("Mary", "had", "a", "little", "lamb").max
  // "little"
val b = ArrayBuffer(1, 7, 2, 9)
val bSorted = b.sorted 
  // b is unchanged; bSorted is ArrayBuffer(1, 2, 7, 9)
val bDescending = b.sortWith(_ > _) // ArrayBuffer(9, 7, 2, 1)
val a = Array(1, 7, 2, 9)
a.sortInPlace()
  // a is now Array(1, 2, 7, 9)
a.mkString(" and ")
  // "1 and 2 and 7 and 9"
a.mkString("<", ",", ">")
  // "<1,2,7,9>"
a.toString
  // "[I@b73e5" 
  // This is the useless toString method for arrays, straight from Java
b.toString
  // "ArrayBuffer(1, 7, 2, 9)"

// .sum .min .max built in func0