package scala$minusimpatient$minus3e$minuscode.ch4.src.main.scala


final class section3$u002Eworksheet$_ {
def args = section3$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch4/src/main/scala/section3.worksheet.sc"""
/*<script>*/
// Constructing a mutable map:
val scores = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

// Updating or adding entries:
scores("Bob") = 10 
  // Updates the existing value for the key "Bob" (assuming scores is mutable)
scores("Fred") = 7 
  // Adds a new key/value pair to scores (assuming it is mutable)
scores ++= Map("Bob" -> 10, "Fred" -> 7)

// Removing an entry:
scores -= "Alice"

// Adding entries to an immutable map yields another immutable map: 
val someScores = Map("Alice" -> 10, "Bob" -> 3)
val moreScores = someScores + ("Cindy" -> 7) // Yields a new immutable map

// Updating a var with immutable maps:
var currentScores = moreScores
currentScores = currentScores + ("Fred" -> 0)
currentScores += "Donald" -> 5
currentScores = currentScores - "Alice"
currentScores -= "Alice"
currentScores

/*</script>*/ /*<generated>*//*</generated>*/
}

object section3$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section3$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section3$u002Eworksheet_sc.script as `section3.worksheet`

