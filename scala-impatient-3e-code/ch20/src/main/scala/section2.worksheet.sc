type Elem[C] = C match
  case String => Char
  case Iterable[t] => t
  case Any => C

def initial[C <: Matchable](c: C): Elem[C] = 
  c match
    case s: String => s(0)
    case i: Iterable[t] => i.head
    case _: Any => c

initial("Fred")
initial(List(1, 7, 2, 9))
initial(java.awt.Point(0, 0))

type FlatElem[C] = C match
  case String => Char
  case Iterable[t] => FlatElem[t] // Recursion
  case Any => C

{
  def flatInitial[C](c: C): FlatElem[C] = 
    c.asInstanceOf[c.type & Matchable] match
      case s: String => s(0)
      case i: Iterable[t] => flatInitial(i.head)
      case x: Any => x
  
  flatInitial(List(List(1, 7), List(2, 9))) // 1
}
{

  // Nicer syntax:

  import compiletime.asMatchable

  def flatInitial[C](c: C): FlatElem[C] =
    c.asMatchable match
      case s: String => s(0)
      case i: Iterable[t] => flatInitial(i.head)
      case x: Any => x

  flatInitial(List(List(1, 7), List(2, 9))) // 1
}
