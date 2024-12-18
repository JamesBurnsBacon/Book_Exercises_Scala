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
