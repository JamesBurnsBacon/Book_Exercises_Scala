package scala$minusimpatient$minus3e$minuscode.ch20.src.main.scala


final class section3$u002Eworksheet$_ {
def args = section3$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch20/src/main/scala/section3.worksheet.sc"""
/*<script>*/
abstract sealed class HList :
  def ::[H, T >: this.type <: HList](head: H): HNonEmpty[H, T] = HNonEmpty(head, this)

case object HEmpty extends HList
case class HNonEmpty[H, T <: HList](head: H, tail: T) extends HList
val lst = "Fred" :: 42 :: HEmpty // Type is HNonEmpty[String, HNonEmpty[Int, HEmpty.type]]
lst.head // Type is String
lst.tail.head // Type is Int
lst.tail.tail // Type is HEmpty

{
  // This version of append is not satisfactory
  def append(a: HList, b: HList): HList =
    a match
      case HEmpty => b
      case ne: HNonEmpty[?, ?] => HNonEmpty(ne.head, append(ne.tail, b))
  
  val lst2 = append(lst, lst) // Type is HList
}

{
  // Using a recursive match type, the result type can be accurately produced
  type Append[A <: HList, B <: HList] <: HList = A match
    case HEmpty.type => B
    case HNonEmpty[h, t] => HNonEmpty[h, Append[t, B]]
  
  def append[A <: HList, B <: HList](a: A, b: B): Append[A, B] =
    a match
      case _: HEmpty.type => b
      case ne: HNonEmpty[?, ?] => HNonEmpty(ne.head, append(ne.tail, b))
  
  val lst2 = append(lst, lst) // Type is HList
  lst2.head // Type is String
  lst2.tail.tail.tail.tail // Type is HEmpty
}

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

