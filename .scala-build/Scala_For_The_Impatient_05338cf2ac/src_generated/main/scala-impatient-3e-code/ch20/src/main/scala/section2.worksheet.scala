package scala$minusimpatient$minus3e$minuscode.ch20.src.main.scala


final class section2$u002Eworksheet$_ {
def args = section2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch20/src/main/scala/section2.worksheet.sc"""
/*<script>*/
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

