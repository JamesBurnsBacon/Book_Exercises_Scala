package scala$minusimpatient$minus3e$minuscode.ch13.src.main.scala


final class section11$u002Eworksheet$_ {
def args = section11$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch13/src/main/scala/section11.worksheet.sc"""
/*<script>*/
var count = 0
def process(s: String) = 
  println(s)
  count += 1
  return count == 500
val iter = "uncopyrightable".permutations // some Iterator
var done = false
while !done && iter.hasNext do
  done = process(iter.next())

val result = iter.take(500).toList
val result2 = iter.takeWhile(isNice).toList // isNice is some function returning Boolean.

val filename = "/etc/hosts"
val iter = scala.io.Source.fromFile(filename).buffered
while iter.hasNext && iter.head == '#' do
  while iter.hasNext && iter.head != '\n' do
    iter.next
// Now iter points to the first line not starting with #
iter.head

/*</script>*/ /*<generated>*//*</generated>*/
}

object section11$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section11$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section11$u002Eworksheet_sc.script as `section11.worksheet`

