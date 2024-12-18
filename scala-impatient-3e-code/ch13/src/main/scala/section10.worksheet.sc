val prices = List(5.0, 20.0, 9.95)
val quantities = List(10, 2, 1)
prices.zip(quantities)
prices.zip(quantities).map(_ * _)
prices.zip(quantities).map(_ * _).sum
List(5.0, 20.0, 9.95).zip(List(10, 2))
List(5.0, 20.0, 9.95).zipAll(List(10, 2), 0.0, 1)
"Scala".zipWithIndex
"Scala".zipWithIndex.max
