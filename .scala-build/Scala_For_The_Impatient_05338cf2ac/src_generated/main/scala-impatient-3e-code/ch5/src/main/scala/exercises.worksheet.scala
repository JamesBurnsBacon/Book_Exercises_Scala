package scala$minusimpatient$minus3e$minuscode.ch5.src.main.scala


final class exercises$u002Eworksheet$_ {
def args = exercises$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch5/src/main/scala/exercises.worksheet.sc"""
/*<script>*/
// 1 improve Counter class so that it doesn't turn negative at Int.MaxValue


// 2 class BankAccount with methods deposit and withdraw, read only balance property


// 3 class Time with read only properties of hours and minutes, and a method
// before(other:Time): Boolean that checks whether this time comes before the other
// A Time object should be constructed as Time(hrs, min), where hrs is in military
// time format (between 0 and 23)


// 4 reimplement above class so that the internal representation is a number of minutes
// since midnight (between 0 and 24 * 60 - 1). Do not change the public interface.
// client code should be unaffected by your change.


// 5 In the Person class, provide a primary constructor that turns negative ages to 0


// 6 class Person with a primary constructor that accepts a string containing a firstname
// a space, and a last name (such as "Donald Clinton"). Supply read-only properties
// firstName and lastName. Should the primary constructor parameter be a var val or plain?


// 7 class Car with read-only properties for manufacturer, model name, model year, and a
// read-write property for the license plate. Supply four constructors. All require the
// manufacturer and model name. Optionally, model year and license plate can also be specified
// in the constructor. If not, the model year is set to -1 and license plate to empty str.
// Which constructor are you choosing as the primary constructor? Why?


// 8 reimplement above class in Python. How much shorter is the scala class?


// 9 consider the class
// class Employee(val name: String, var salary:Double):
//    def this() = this("John Q. Public", 0.0)
// rewrite to use explicit fields and a default primary constructor. Which form do you
// prefer? Why?


// 10 implement the equals method for the Member class that is nested inside the Network
// class. For two members to be equal, they need to be in the same network.
/*</script>*/ /*<generated>*//*</generated>*/
}

object exercises$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new exercises$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export exercises$u002Eworksheet_sc.script as `exercises.worksheet`

