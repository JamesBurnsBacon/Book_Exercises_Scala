package scala$minusimpatient$minus3e$minuscode.ch9.src.main.scala


final class section5$u002Eworksheet$_ {
def args = section5$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch9/src/main/scala/section5.worksheet.sc"""
/*<script>*/
import java.io.*

val filename = "/tmp/numbers.txt"
val out = PrintWriter(filename)
for i <- 1 to 100 do out.println(i)
val quantity = 10
val price = 29.95
out.printf("%6d %10.2f%n", quantity, price)
out.close()
scala.io.Source.fromFile(filename).mkString

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

