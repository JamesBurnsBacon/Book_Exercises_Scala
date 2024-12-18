package section3

import scala.util.*

@main def demo3 =  
  val str = if math.random() < 0.5 then "forty-two" else "42"
  val t = Try(str.toInt)

  // Using pattern matching to analyze a Try instance
  t match 
    case Success(v) => println(s"The answer is $v")
    case Failure(ex) => println(ex.getMessage)

  // Using isSuccess/isFailure
  if t.isSuccess then println(s"The answer is ${t.get}")
  if t.isFailure then println(t.failed.get.getMessage)
