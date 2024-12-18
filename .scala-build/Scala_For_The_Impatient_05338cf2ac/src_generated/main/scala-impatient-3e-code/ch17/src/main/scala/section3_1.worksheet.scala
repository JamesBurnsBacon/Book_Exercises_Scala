package scala$minusimpatient$minus3e$minuscode.ch17.src.main.scala


final class section3_1$u002Eworksheet$_ {
def args = section3_1$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch17/src/main/scala/section3_1.worksheet.sc"""
/*<script>*/
/*
// This won't work because T might not have a compareTo method
class Pair[T](val first: T, val second: T) :
  def smaller = if first.compareTo(second) < 0 then first else second // Error
*/
// Use a bound to guarantee that T is a subtype of Comparable[T]
class Pair[T <: Comparable[T]](val first: T, val second: T) :
  def smaller = if first.compareTo(second) < 0 then first else second
  override def toString = s"($first, $second)"

val p = Pair("Fred", "Brooks")
p.smaller // "Brooks"
Pair(4, 2)

/*
// Because URL isn't a subtype of Comparable[URL], you cannot form pairs of URL instances
import java.net.URL
val url1 = URL("http://scala-lang.org")
val url2 = URL("http://horstmann.com")
val p2 = Pair(url1, url2) // Error
*/

// The result is a Pair[Integer], not a Pair[Int]
val p3 = Pair(4, 2)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section3_1$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section3_1$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section3_1$u002Eworksheet_sc.script as `section3_1.worksheet`

