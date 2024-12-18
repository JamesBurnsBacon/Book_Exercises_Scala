package scala$minusimpatient$minus3e$minuscode.ch13.src.main.scala


final class section4$u002Eworksheet$_ {
def args = section4$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch13/src/main/scala/section4.worksheet.sc"""
/*<script>*/
val digits = List(4, 2)

// Head and tail

digits.head
digits.tail
digits.tail.head
digits.tail.tail

// The :: operator

9 :: List(4, 2)
9 :: 4 :: 2 :: Nil
9 :: (4 :: (2 :: Nil))

val fibs = List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55)

// With if/else
{
  def sum(lst: List[Int]): Int =
    if lst == Nil then 0 else lst.head + sum(lst.tail)

  sum(fibs)
}

// With pattern matching
{
  def sum(lst: List[Int]): Int = lst match
    case Nil => 0
    case h :: t => h + sum(t) // h is lst.head, t is lst.tail

  sum(fibs)
}

// You don't actually need recursion for computing the sum
List(9, 4, 2).sum // Yields 15

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

