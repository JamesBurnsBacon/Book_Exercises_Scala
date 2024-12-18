package scala$minusimpatient$minus3e$minuscode.ch13.src.main.scala


final class section8$u002Eworksheet$_ {
def args = section8$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch13/src/main/scala/section8.worksheet.sc"""
/*<script>*/
import scala.collection.mutable.ArrayBuffer

val names = List("Peter", "Paul", "Mary")
// The following are the same
names.map(_.toUpperCase) // List("PETER", "PAUL", "MARY")
for (n <- names) yield n.toUpperCase

// map vs flatMap
def ulcase(s: String) = Vector(s.toUpperCase, s.toLowerCase)
names.map(ulcase)
names.flatMap(ulcase)

// The following are the same
for (i <- 1 to 10) yield i * i
(1 to 10).map(i => i * i)

// The following are the same
for (i <- 1 to 10; j <- 1 to i) yield i * j
(1 to 10).flatMap(i => (1 to i).map(j => i * j))

// mapInPlace is like map, but in-place for mutable collections
val buffer = ArrayBuffer("Peter", "Paul", "Mary")
buffer.mapInPlace(_.toUpperCase)
buffer

// foreach is like map, but only for the side effect
names.foreach(println)

// collect is like map, but with a partial function
"-3+4".collect({ case '+' => 1 ; case '-' => -1 }) // Vector(-1, 1)

// groupBy groups elements that map to the same value
val words = "Mary had a little lamb. Its fleece was white as snow.".split("\\PL"")
val map = words.groupBy(_.substring(0, 1).toUpperCase)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section8$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section8$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section8$u002Eworksheet_sc.script as `section8.worksheet`

