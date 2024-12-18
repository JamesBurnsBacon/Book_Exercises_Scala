package scala$minusimpatient$minus3e$minuscode.ch17.src.main.scala


final class section8_2$u002Eworksheet$_ {
def args = section8_2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch17/src/main/scala/section8_2.worksheet.sc"""
/*<script>*/
// This trait is contravariant
trait Friend[-T] :
  def befriend(someone: T): String

def makeFriendWith(s: Student, f: Friend[Student]) = f.befriend(s)

class Person(name: String) extends Friend[Person] :
  override def toString = s"Person $name"
  override def befriend(someone: Person) = s"$this and $someone are now friends"
class Student(name: String, major: String) extends Person(name) :
  override def toString = s"Student $name majoring in $major"
val susan = Student("Susan", "CS")
val fred = Person("Fred")

makeFriendWith(susan, fred)

// Function1 is contravariant in its first type parameter
// and covariant in the second

def friendsOfStudents(students: Seq[Student], findFriend: Function1[Student, Person]) =
  // You can write the second parameter as findFriend: Student => Person 
  for s <- students yield findFriend(s)

def findStudentFriendsOfPerson(p: Person) : Student = susan // Susan is everyone's friend

val wilma = Student("Wilma", "CS")
friendsOfStudents(Array(wilma, susan), findStudentFriendsOfPerson)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section8_2$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section8_2$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section8_2$u002Eworksheet_sc.script as `section8_2.worksheet`

