package scala$minusimpatient$minus3e$minuscode.ch9.src.main.scala


final class section2$u002Eworksheet$_ {
def args = section2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch9/src/main/scala/section2.worksheet.sc"""
/*<script>*/
import scala.io.*

var source = Source.fromFile("myfile.txt", "UTF-8")
var upper = 0
def process(c: Char) = if c.isUpper then upper += 1
for c <- source do process(c)
upper


def isNice(c: Char) = c.isUpper
def process(i: BufferedIterator[Char]) = 
  var result = ""
  while i.hasNext && !i.head.isWhitespace do
    result += i.next
  println(result)

source = Source.fromFile("myfile.txt", "UTF-8")
val iter = source.buffered
while iter.hasNext do
  if isNice(iter.head) then
    process(iter)
  else
    iter.next
source.close()

/*</script>*/ /*<generated>*//*</generated>*/
}

object section2$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section2$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section2$u002Eworksheet_sc.script as `section2.worksheet`

