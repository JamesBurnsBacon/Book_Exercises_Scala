// A for comprehension:
val a = Array(2, 3, 5, 7, 11)
val result = for elem <- a yield 2 * elem
  // result is Array(4, 6, 10, 14, 22)

// A guard:
for elem <- a if elem % 2 == 0 yield elem / 2

// You can use map and filter instead of 
a.filter(_ % 2 == 0).map(_ / 2)

// Task: Remove all negative elements.
import scala.collection.mutable.ArrayBuffer
var b = ArrayBuffer(1, 4, -7, -5, 3, -1)

// Sequential solution:
var n = b.length
var i = 0
while i < n do
  if b(i) >= 0 then i += 1
  else
    b.remove(i)
    n -= 1
b = ArrayBuffer(1, 4, -7, -5, 3, -1)

// With for/yield:
val nonNegative = for elem <- b if elem >= 0 yield elem

// This yields a new collection. What if we want to modify the original buffer?
val positionsToRemove = for i <- b.indices if b(i) < 0 yield i
for i <- positionsToRemove.reverse do b.remove(i)
b

// Alternatively, remember the positions to keep:
b = ArrayBuffer(1, 4, -7, -5, 3, -1)
val positionsToKeep = for i <- b.indices if b(i) >= 0 yield i
for j <- positionsToKeep.indices do b(j) = b(positionsToKeep(j))
b.dropRightInPlace(b.length - positionsToKeep.length)
b
