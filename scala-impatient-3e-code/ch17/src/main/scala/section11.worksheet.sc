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
