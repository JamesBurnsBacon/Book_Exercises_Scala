package scala$minusimpatient$minus3e$minuscode.ch13.src.main.scala


final class section5$u002Eworksheet$_ {
def args = section5$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch13/src/main/scala/section5.worksheet.sc"""
/*<script>*/
// Adding an element twice has no effect
Set(2, 0, 1) + 1

// Hash sets have seemingly random iteration order
Set(1, 2, 3, 4, 5, 6)

// Linked hash sets retain the insertion order
val weekdays = scala.collection.mutable.LinkedHashSet("Mo", "Tu", "We", "Th", "Fr")

// Sorted sets are traversed in sorted order
val numbers = scala.collection.mutable.SortedSet(1, 2, 3, 4, 5, 6)

// Set operations
val digits = Set(1, 7, 2, 9)
digits.contains(0) // false
Set(1, 2).subsetOf(digits) // true
val primes = Set(2, 3, 5, 7)
digits.union(primes)
digits & primes
digits -- primes

/*</script>*/ /*<generated>*//*</generated>*/
}

object section5$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section5$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section5$u002Eworksheet_sc.script as `section5.worksheet`

