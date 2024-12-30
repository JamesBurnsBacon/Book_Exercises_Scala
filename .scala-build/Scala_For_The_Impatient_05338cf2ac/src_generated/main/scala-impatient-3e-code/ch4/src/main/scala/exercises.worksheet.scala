package scala$minusimpatient$minus3e$minuscode.ch4.src.main.scala


final class exercises$u002Eworksheet$_ {
def args = exercises$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch4/src/main/scala/exercises.worksheet.sc"""
/*<script>*/
// 1 Map of prices for a number of gizmos. Then a second map with same keys but
// prices at a ten percent discount
val fullPrices = Map("pen" -> 1.00, "book" -> 10.00, "GPU" -> 1000.00)
for (k,v) <- fullPrices yield (k,v*.9)

// 2 Read words from a file using java.util.Scanner
// use a mutable map to count the frequency of words.
// at the end, print out the words and their counts
import java.util.*
import scala.collection.mutable

val wordCounts = mutable.Map[String, Int]().withDefaultValue(0)

val in = new java.util.Scanner(new java.io.File("scala-impatient-3e-code/ch4/src/main/scala/myfile.txt"))

while in.hasNext() do
    val word = in.next().toLowerCase().replaceAll("[^a-zA-Z0-9]","") //normalize words
    if word.nonEmpty then wordCounts(word) += 1

in.close()
for ((w, c) <- wordCounts) do println(s"$w: $c")
/*</script>*/ /*<generated>*//*</generated>*/
}

object exercises$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new exercises$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export exercises$u002Eworksheet_sc.script as `exercises.worksheet`

