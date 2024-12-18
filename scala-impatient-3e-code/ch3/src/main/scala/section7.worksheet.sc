val matrix = Array.ofDim[Double](3, 4) // Three rows, four columns
val row = 1
val column = 2
matrix(row)(column) = 42
matrix
val triangle = Array.ofDim[Array[Int]](10)
for i <- triangle.indices do 
  triangle(i) = Array.ofDim[Int](i + 1)
