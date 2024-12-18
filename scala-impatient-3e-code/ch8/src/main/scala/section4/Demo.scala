package section4

class Person(val name: String, val age: Int) :
  override def toString = getClass.getName + "[name=" + name +
    ",age=" + age + "]"

class Employee(name: String, age: Int, var salary : Double) extends
  Person(name, age) :
  override def toString = super.toString + "[salary=" + salary + "]"

import java.nio.charset.*
import java.nio.file.*

class ModernPrintWriter(p: Path, cs: Charset = StandardCharsets.UTF_8) extends
  java.io.PrintWriter(Files.newBufferedWriter(p, cs))

@main def demo = 
  val e = Employee("Fred", 42, 50000)
  val p = Files.createTempFile("temp", ".txt")
  val out = ModernPrintWriter(p)
  out.println(e)
  out.close()  
  println(Files.readString(p))
  Files.delete(p)
