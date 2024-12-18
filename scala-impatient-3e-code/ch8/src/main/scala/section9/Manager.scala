package section9

import scala.language.adhocExtensions
  // The Employee class is not open

class Manager extends Employee

@main def demo1 = 
  val r = scala.math.random()
  val p = if r < 0.33 then new Person 
    else if r < 0.67 then new Employee 
    else new Manager  
  println(p)
