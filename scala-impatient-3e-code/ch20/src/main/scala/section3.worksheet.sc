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
