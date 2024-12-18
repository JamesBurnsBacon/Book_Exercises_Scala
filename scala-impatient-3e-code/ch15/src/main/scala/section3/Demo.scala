package section3
import jakarta.json.bind.*
import jakarta.json.bind.annotation.*
import scala.annotation.{unchecked as _, _}
import scala.beans.*

class Person :
  @BeanProperty
  // Named arguments:  
  @JsonbProperty(value="p_name", nillable=true) var name: String = null
  @BeanProperty
  // Only the value argument:
  @JsonbProperty("p_age") var age : Int = 0
    // The value argument is "p_age"
  @BeanProperty
  // No parentheses if no argument:
  @JsonbTransient val nice: Boolean = true

@main def demo3 = 
  val nobody = new Person
  val jsonb = JsonbBuilder.create()
  println(jsonb.toJson(nobody))
