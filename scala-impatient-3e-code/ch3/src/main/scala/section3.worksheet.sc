val a = "Mary had a little lamb".split(" ")
for i <- 0 until a.length do
  println(s"$i: ${a(i)}")

// Modify the range to skip elements, go backwards:
0 until a.length by 2
  // Range(0, 2, 4, ...)
a.length -1 to 0 by -1
  // Range(..., 2, 1, 0)

// The indices method yields a range of all indices:
a.indices
a.indices.reverse

// If you don't need the indices, traverse the elements: 
for elem <- a do
  println(elem)
