package scala$minusimpatient$minus3e$minuscode.ch17.src.main.scala


final class section7_2$u002Eworksheet$_ {
def args = section7_2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch17/src/main/scala/section7_2.worksheet.sc"""
/*<script>*/
// Type constraints that cannot be expressed as type bounds

class Pair[T](val first: T, val second: T) :
  def smaller(using ev: T <:< Comparable[T]) =
    if first.compareTo(second) < 0 then first else second

val p = Pair("Fred", "Brooks")
p.smaller

// We can form a pair of non-comparable URLs as long as we don't call smaller

import java.net.URL
val url1 = URL("http://scala-lang.org")
val url2 = URL("http://horstmann.com")
val p2 = Pair(url1, url2) // Ok

// p2.smaller // Error

val friends = Map("Fred" -> "Barney", "Dino" -> "Wilma")
val friendOpt = friends.get("Wilma") // An Option[String] 
val friendOrNull = friendOpt.orNull // A String or null

// orNull has a constraint Null <:< A, so it can't be applied to Option[Int]
/*
val numberOpt = if scala.math.random() < 0.5 then Some(42) else None
val number: Int = numberOpt.orNull // Error
*/

/*</script>*/ /*<generated>*//*</generated>*/
}

object section7_2$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section7_2$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section7_2$u002Eworksheet_sc.script as `section7_2.worksheet`

