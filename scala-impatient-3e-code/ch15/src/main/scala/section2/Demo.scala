package section2
import jakarta.json.bind.*
import jakarta.json.bind.annotation.*
import scala.annotation.{unchecked as _, _}
import scala.beans.*

// Where annotations can be placed
@deprecated class Sample : // Class
  @volatile var alive = true // Field
  @tailrec final def gcd(a: Int, b: Int): Int = if b == 0 then a else gcd(b, a % b) // Method
  def display(@nowarn message: String) = "" // Parameter
case class Box[@specialized T](value: T) // Type parameter

class Person @JsonbCreator (// Annotated primary constructor
  // With multiple annotations, the order doesn't matter
  @JsonbProperty @BeanProperty val name: String,
  @BeanProperty @JsonbProperty val age: Int
  )

class Localized extends StaticAnnotation

// Here the String type is annotated

val country: String @Localized = java.util.Locale.getDefault().getDisplayCountry()

@main def demo2 = 
  val fred = new Person("Fred", 42)
  val jsonb = JsonbBuilder.create()
  println(jsonb.toJson(fred))

  // Annotating an expression
  import scala.jdk.CollectionConverters.*
  val props = System.getProperties.asScala
  val key = "java.version"
  (props.get(key): @unchecked) match { case Some(value) => println(value) }
    // The expression props.get(key) is annotated
  
  println(country)
