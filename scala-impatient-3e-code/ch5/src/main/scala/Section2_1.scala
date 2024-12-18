@main def personDemo =
  class Person :
    var age = 0

  val fred = Person()
  fred.age = 21 // Calls  fred.age_=(21)
  println(fred.age) // Calls the method fred.age()
