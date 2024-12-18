List(1, 7, 2, 9).reduceLeft(_ - _)

List(1, 7, 2, 9).reduceRight(_ - _)

List(1, 7, 2, 9).foldLeft(0)(_ - _)

val freq = scala.collection.mutable.Map[Char, Int]()
for (c <- "Mississippi") freq(c) = freq.getOrElse(c, 0) + 1
// Now freq is Map('i' -> 4, 'M' -> 1, 's' -> 4, 'p' -> 2)
freq

"Mississippi".foldLeft(Map[Char, Int]())((m, c) => m + (c -> (m.getOrElse(c, 0) + 1)))

(1 to 10).scanLeft(0)(_ + _)
