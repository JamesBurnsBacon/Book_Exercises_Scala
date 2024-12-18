@main def constructorDemo1 =
  // A class with two auxiliary constructors
  class Person :
    private var name = ""
    private var age = 0
  
    def this(name: String) = // An auxiliary constructor
      this() // Calls primary constructor 
      this.name = name   
  
    def this(name: String, age: Int) = // Another auxiliary constructor 
      this(name) // Calls previous auxiliary constructor
      this.age = age
    def description = s"$name is $age years old"
    
  val p1 = Person() // Primary constructor
  val p2 = Person("Fred") // First auxiliary constructor
  val p3 = Person("Fred", 42) // Second auxiliary constructor
  println(p1.description)       
  println(p2.description)       
  println(p3.description)
