// Useful higher-order functions

(1 to 9).map(0.1 * _)
(1 to 9).map("*" * _).foreach(println _)
(1 to 9).filter(_ % 2 == 0) // 2, 4, 6, 8
(1 to 9).reduceLeft(_ * _)
"Mary had a little lamb".split(" ").sortWith(_.length < _.length)
