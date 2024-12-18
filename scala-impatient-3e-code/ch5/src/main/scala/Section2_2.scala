@main def personDemo2 =
  // A class with user-defined getter amd setter:
  class Person :
    private var privateAge = 0 // Make private and rename
   
    def age = privateAge
    def age_=(newValue: Int) = 
      if newValue > privateAge then privateAge = newValue // Can't get younger

  // Calling the setter and getter:
  val fred = Person()
  fred.age = 30
  fred.age = 21
  println(fred.age) // Prints 30
