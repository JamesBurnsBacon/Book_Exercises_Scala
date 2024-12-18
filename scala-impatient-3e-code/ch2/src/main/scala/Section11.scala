@main def demo11() =
  val words1 =
    println("words1: Reading file")
    scala.io.Source.fromFile("/usr/share/dict/words").mkString
    // Evaluated as soon as words1 is defined
  lazy val words2 =
    println("words2: Reading file")
    scala.io.Source.fromFile("/usr/share/dict/words").mkString
    // Evaluated the first time words2 is used
  def words3 =
    println("words3: Reading file")
    scala.io.Source.fromFile("/usr/share/dict/words").mkString
    // Evaluated every time words3 is used
  println(words1.length()) // Already defined
  println(words2.length()) // Lazily loaded
  println(words2.length()) // Not loaded again
  println(words3.length()) // Loaded
  println(words3.length()) // Loaded again
