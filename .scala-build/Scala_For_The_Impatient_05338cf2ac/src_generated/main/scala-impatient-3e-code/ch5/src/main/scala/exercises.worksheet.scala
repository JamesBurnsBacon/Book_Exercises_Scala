package scala$minusimpatient$minus3e$minuscode.ch5.src.main.scala


final class exercises$u002Eworksheet$_ {
def args = exercises$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch5/src/main/scala/exercises.worksheet.sc"""
/*<script>*/
import scala.collection.mutable.ArrayBuffer
// 1 improve Counter class so that it doesn't turn negative at Int.MaxValue
class Counter(private var value: Int = 0):
  def increment() = if(value + 1 < Int.MaxValue) then value += 1 else println("max count reached")
  def current = value
  
def counterDemo =
  val myCounter = Counter()
  myCounter.increment() 
  println(myCounter.current)

counterDemo

// 2 class BankAccount with methods deposit and withdraw, read only balance property
class BankAccount(private var balance: Double = 0):
    def currentBalance = balance
    def deposit(depositAmt: Double) =
        this.balance += depositAmt
    def withdraw(withdrawAmt: Double) =
        if (withdrawAmt <= balance) then
            this.balance -= withdrawAmt   
        else println("Insufficient Funds")

def bankDemo =
    val myBankAccount = BankAccount(10_000)
    print(myBankAccount.currentBalance)
    myBankAccount.deposit(10_000)
    myBankAccount.withdraw(5_000)
    print(" " + myBankAccount.currentBalance)
    print(" " + myBankAccount.currentBalance)

bankDemo

// 3 class Time with read only properties of hours and minutes, and a method
// before(other:Time): Boolean that checks whether this time comes before the other
// A Time object should be constructed as Time(hrs, min), where hrs is in military
// time format (between 0 and 23)
class Time3(private var hours: Int = 0, private var minutes: Int = 0):
    def currentHour = if (hours < 24) then hours else hours % 24 //24h clock
    def currentMinute = minutes
    private var comparisonTime = currentHour*60 + currentMinute
    def currentTime = s"$currentHour:$currentMinute"
    def before(other:Time3): Boolean =
        comparisonTime < other.comparisonTime

def timeDemo3 =
    val myTimeDemo3 = Time3(16, 29)
    val myOtherTimeDemo3 = Time3(17, 0)
    print(myTimeDemo3.currentTime + " ")
    println(myTimeDemo3.before(myOtherTimeDemo3))

timeDemo3

// 4 reimplement above class so that the internal representation is a number of minutes
// since midnight (between 0 and 24 * 60 - 1). Do not change the public interface.
// client code should be unaffected by your change.
class Time4(private var hours: Int = 0, private var minutes: Int = 0):
    def currentHour = if (hours < 24) then hours else hours % 24 //24h clock
    def currentMinute = minutes
    private var comparisonTime = currentHour*60 + currentMinute
    def currentTime = s"${comparisonTime / 60}:${comparisonTime % 60}"
    def before(other:Time4): Boolean =
        comparisonTime < other.comparisonTime

def timeDemo4 =
    val myTimeDemo4 = Time4(16, 29)
    val myOtherTimeDemo4 = Time4(17, 0)
    println(myTimeDemo4.currentTime + " ")
    println(myTimeDemo4.before(myOtherTimeDemo4))

timeDemo4

// 5 In the Person class, provide a primary constructor that turns negative ages to 0
class Person(private var ageInput: Int = 0):
    def age: Int = ageInput
    def age_=(newValue: Int): Unit =
        ageInput = 
            if (newValue < 0) then 0 
            else newValue

def personDemo5 =
    val p1 = Person(54)
    print(p1.age)
    p1.age = -5
    print(p1.age)
    p1.age = 55
    print(p1.age)

personDemo5

// 6 class Person with a primary constructor that accepts a string containing a firstname
// a space, and a last name (such as "Donald Clinton"). Supply read-only properties
// firstName & lastName. Should the primary constructor parameter be a var val or plain?
class Person6(val fullName: String = "Humba Wumba"):
    def firstName = fullName.split(" ").head
    def lastName = fullName.split(" ").last

def personDemo6 =
    val p1 = Person6("Mongo Jongo")
    print(p1.firstName)
    print(p1.lastName)

personDemo6
//the primary constructor parameter should be a val to be read only

// 7 class Car with read-only properties for manufacturer, model name, model year, and a
// read-write property for the license plate. Supply four constructors. All require the
// manufacturer and model name. Optionally, model year and license plate can also be specified
// in the constructor. If not, the model year is set to -1 and license plate to empty str.
// Which constructor are you choosing as the primary constructor? Why?
// The primary constructor only requires manufacturer and model name, supplying default
// args for the optional criteria.
class Car7(
    val manufacturer: String, 
    val model_name: String,
    val model_year: Int = -1,
    private var license_plate: String = ""
    ):
    def plate = license_plate
    def plate_=(newPlate: String): Unit = license_plate = newPlate

    def this(manufacturer: String, model_name: String) =
        this(manufacturer, model_name, -1, "") //calls primary constructor

    def this(manufacturer: String, model_name: String, model_year: Int) =
        this(manufacturer, model_name, model_year, "") //calls primary constructor

    def this(manufacturer: String, model_name: String, license_plate: String) =
        this(manufacturer, model_name, -1, license_plate) //calls primary constructor        

def carDemo7 =
    val car1 = Car7("Audi", "A4", 2022)
    car1.plate = "ILUVYOU"
    println(car1.plate)

carDemo7    
// 8 reimplement above class in Python. How much shorter is the scala class?
//see exercise5-8.py
// scala is 16 lines, python is around 40

// 9 consider the class
// class Employee(val name: String, var salary:Double):
//    def this() = this("John Q. Public", 0.0)
// rewrite to use explicit fields and a default primary constructor. Which form do you
// prefer? Why?
//The default primary constructor is concise and more easily readable
class Employee9(val name: String = "John Deer", var salary: Double = 0)

// 10 implement the equals method for the Member class that is nested inside the Network
// class. For two members to be equal, they need to be in the same network.
import scala.collection.mutable.*

class Network:
    class Member(val name: String):
        val contacts = ArrayBuffer[Member]()

        override def equals(obj: Any): Boolean = obj match
            case that: Network#Member =>
                this.name == that.name && Network.this == that.network
            case _ => false

        def network: Network = Network.this

    private val members = ArrayBuffer[Member]()

    def join(name: String): Member =
        val m = Member(name)
        members += m
        m

def networkDemo10 =
    val twatter = Network()
    val onlyCrayons = Network()

    val lisa1 = twatter.join("Lisa")
    val lisa2 = twatter.join("Lisa")     
    val lisa3 = onlyCrayons.join("Lisa")

    println(lisa1 == lisa2)
    println(lisa1 == lisa3)

networkDemo10                         
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

