file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch5/src/main/scala/exercises.worksheet.sc
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition <error> is defined in
  C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch5/src/main/scala/exercises.worksheet.sc
and also in
  C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch5/src/main/scala/exercises.worksheet.sc
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 3866
uri: file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch5/src/main/scala/exercises.worksheet.sc
text:
```scala
object worksheet{
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
  class Person6(private val fullName: String = "Humba Wumba"):
      def firstName = fullName.split(" ").head
      def lastName = fullName.split(" ").tail
  
  def pe@@
  
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
}
```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition <error> is defined in
  C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch5/src/main/scala/exercises.worksheet.sc
and also in
  C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch5/src/main/scala/exercises.worksheet.sc
One of these files should be removed from the classpath.