package scala$minusimpatient$minus3e$minuscode.ch17.src.main.scala


final class section11$u002Eworksheet$_ {
def args = section11$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch17/src/main/scala/section11.worksheet.sc"""
/*<script>*/
class Person(name: String) :
  override def toString = s"Person $name"
class Student(name: String, major: String) extends Person(name) :
  override def toString = s"Student $name majoring in $major"

val fred = Student("Fred", "Marketing")
val wilma = Student("Wilma", "CS")

def makeFriends(people: java.util.List[? <: Person]) = s"$people are now friends" // This is Scala

val lst = java.util.ArrayList[Student]()
lst.add(fred)
lst.add(wilma)

makeFriends(lst)

class Pair[T](var first: T, var second: T)
def makeFriends(p: Pair[? <: Person]) = s"${p.first} and ${p.second} are now friends" // OK to call with a Pair[Student]

makeFriends(Pair(fred, wilma))

import java.util.Comparator
def min[T](p: Pair[T], comp: Comparator[? >: T]) =
  if comp.compare(p.first, p.second) < 0 then p.first else p.second

min(Pair("Fred", "Brooks"), (s, t) => s.length - t.length)

def min[T <: Comparable[? >: T]](p: Pair[T]) =
   if p.first.compareTo(p.second) < 0 then p.first else p.second
min(Pair("Fred", "Brooks"))

/*</script>*/ /*<generated>*//*</generated>*/
}

object section11$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section11$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section11$u002Eworksheet_sc.script as `section11.worksheet`

