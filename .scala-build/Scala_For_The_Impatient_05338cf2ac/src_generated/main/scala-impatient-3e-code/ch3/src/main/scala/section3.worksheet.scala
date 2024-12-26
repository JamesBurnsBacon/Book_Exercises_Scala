package scala$minusimpatient$minus3e$minuscode.ch3.src.main.scala


final class section3$u002Eworksheet$_ {
def args = section3$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch3/src/main/scala/section3.worksheet.sc"""
/*<script>*/
val a = "Mary had a little lamb".split(" ")
for i <- 0 until a.length do
  println(s"$i: ${a(i)}")

// Modify the range to skip elements, go backwards:
0 until a.length by 2
  // Range(0, 2, 4, ...)
a.length -1 to 0 by -1
  // Range(..., 2, 1, 0)

// The indices method yields a range of all indices:
a.indices
a.indices.reverse

// If you don't need the indices, traverse the elements: 
for elem <- a do
  println(elem)


// until is similar to do, but excludes the last value eg i from 0 to a.length -1

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

