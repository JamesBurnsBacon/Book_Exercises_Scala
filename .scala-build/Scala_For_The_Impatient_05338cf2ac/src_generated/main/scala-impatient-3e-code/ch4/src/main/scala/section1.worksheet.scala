package scala$minusimpatient$minus3e$minuscode.ch4.src.main.scala


final class section1$u002Eworksheet$_ {
def args = section1$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch4/src/main/scala/section1.worksheet.sc"""
/*<script>*/
// Constructing an immutable map:
val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

// The arrows are shortcut for pairs or "tuples" of length 2:
"Alice" -> 10
("Alice", 10)

// You can construct a map with pairs:
Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))

// You usually need to allow for absent keys:
scores("Bob") // Like scores.get("Bob") in Java or scores["Bob"] in JavaScript, Python, or C++
if (scores.contains("Donald")) scores("Donald") else 0
val scores2 = scores.withDefaultValue(0)
scores2("Zelda")
  // Yields 0 since "Zelda" is not present
val scores3 = scores.withDefault(_.length)
scores3("Zelda")
  // Yields 5, applying the length function to the key that is not present

  //hash tables, or maps are among the most versatile data structures
  //options used for looking up keys in maps in case of failure
  //key/value pairs a pair is a tuple with n=2
  //default is hashmap, treemaps also available
  //func computes vals, map just looks them up

/*</script>*/ /*<generated>*//*</generated>*/
}

object section1$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section1$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section1$u002Eworksheet_sc.script as `section1.worksheet`

