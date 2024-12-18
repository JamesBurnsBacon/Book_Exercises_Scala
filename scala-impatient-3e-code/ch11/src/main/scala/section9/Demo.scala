package section9

// The unapplySeq method

object Name :
  def unapplySeq(input: String): Option[Seq[String]] = 
    if input.strip == "" then None else Some(input.strip.split(",?\\s+").toSeq)

@main def demo =
  val Name(first, middle, last, rest*) = "John D. Rockefeller IV, B.A."
  println(s"first: $first")
  println(s"middle: $middle")
  println(s"last: $last")
  println(s"last: $rest")
