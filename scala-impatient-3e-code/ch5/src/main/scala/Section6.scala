@main def constructorDemo2 =
  // A class with a primary constructor
  class Person(val name: String, val age: Int) : 
      // Parameters of primary constructor in parentheses after class name
    def description = s"$name is $age years old"

  val p = Person("Fred", 42)
  println(p.description)       

@main def constructorDemo3 =
  // The primary constructor executes all statements in the class definition
  class Person(val name: String, val age: Int) :
    println("Just constructed another person")
    def description = s"$name is $age years old"
  
  val p1 = Person("Fred", 42)
  println(p1.description)       
  val p2 = Person("Wilma", 39)
  println(p2.description)       
  
@main def constructorDemo4 =
  // With default arguments, you may not need auxiliary constructors:
  class Person(val name: String = "", val age: Int = 0) :
    def description = s"$name is $age years old"

  val p = Person()
  println(p.description)

@main def constructorDemo5 =
  // Primary constructor parameters without val or var don't have a getter
  class Person(firstName: String, lastName: String, age: Int) :
    val name = firstName + " " + lastName
    def description = s"$name is $age years old"

  val p = Person("Fred", "Flintstone", 42)
  println(p.description)
  // Cannot refer to p.firstName, p.lastName, p.age
  // firstName, lastName not stored in the object
  // age is stored because it is needed in description
  
@main def constructorDemo6 =
  // This primary constructor is private
  class Person private(val id: Int) :
    private var name = ""
    def this(name: String, id: Int) =
      this(id)
      this.name = name
    def description = s"$name has id $id"

  val p = Person("Fred", 42)
  println(p.description)
