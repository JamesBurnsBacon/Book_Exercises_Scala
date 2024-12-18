package scala$minusimpatient$minus3e$minuscode.ch4.src.main.scala


final class section7$u002Eworksheet$_ {
def args = section7$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch4/src/main/scala/section7.worksheet.sc"""
/*<script>*/
// Using an Option is better than a blank or null default

var friend: Option[String] = Some("Fred")
friend = None // No friend

// Map.get yields an option

val scores = Map("Alice" -> 10, "Bob" -> 7, "Cindy" -> 8)
val alicesScore = scores.get("Alice") // Some(10)
val dansScore = scores.get("Dan") // None

// Not so good: Using isEmpty/get 

if alicesScore.isEmpty
  then println("No score")
  else println(alicesScore.get)

// Good: getOrElse

println(alicesScore.getOrElse("No score"))

// Good: Treating an option like a collection of size 0 or 1

for score <- alicesScore do println(score)

// Good: Use map, filter, foreach

val biggerScore = alicesScore.map(_ + 1) // Some(score + 1) or None
val acceptableScore = alicesScore.filter(_ > 5) // Some(score) if score > 5 or None
alicesScore.foreach(println) // Prints the score if it exists

/*</script>*/ /*<generated>*//*</generated>*/
}

object section7$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section7$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section7$u002Eworksheet_sc.script as `section7.worksheet`

