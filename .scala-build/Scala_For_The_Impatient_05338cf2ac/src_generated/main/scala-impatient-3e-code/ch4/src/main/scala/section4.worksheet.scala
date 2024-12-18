package scala$minusimpatient$minus3e$minuscode.ch4.src.main.scala


final class section4$u002Eworksheet$_ {
def args = section4$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch4/src/main/scala/section4.worksheet.sc"""
/*<script>*/
val map = Map("USA" -> 1, "Switzerland" -> 41, "Germany" -> 49)
def process(k: String, v: Int) = println(s"Country: $k, Code: $v")
// Iterating over entries:
for ((k, v) <- map) process(k, v)

// The key and value sets
val scores = Map("Alice" -> 10, "Bob" -> 7, "Fred" -> 8, "Cindy" -> 7)
scores.keySet // Yields a set with elements "Alice", "Bob", "Fred", and "Cindy"
for (v <- scores.values) println(v) // Prints 10 7 8 7

// Inverting a map: 
for ((k, v) <- map) yield (v, k)

// Immutable maps are traversed in insertion order: 
Map("Fred" -> 1, "Alice" -> 2, "Bob" -> 3)

// The traversal order of mutable maps is not predictable: 
scala.collection.mutable.Map("Fred" -> 1, "Alice" -> 2, "Bob" -> 3)
  // Printed as HashMap(Fred -> 1, Bob -> 3, Alice -> 2)

// Use a LinkedHashMap to retain insertion order:
scala.collection.mutable.LinkedHashMap("Fred" -> 1, "Alice" -> 2, "Bob" -> 3)
  // Printed as LinkedHashMap(Fred -> 1, Alice -> 2, Bob -> 3)

// Sorted maps are traversed in the sort order of the keys:
scala.collection.SortedMap("Fred" -> 1, "Alice" -> 2, "Bob" -> 3)
scala.collection.mutable.SortedMap("Fred" -> 1, "Alice" -> 2, "Bob" -> 3)
  // Printed as TreeMap(Alice -> 2, Bob -> 3, Fred -> 1)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section4$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section4$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section4$u002Eworksheet_sc.script as `section4.worksheet`

