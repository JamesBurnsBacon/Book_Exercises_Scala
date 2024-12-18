package section7
import jakarta.json.bind.*
import jakarta.json.bind.annotation.*
import scala.annotation.*
import scala.annotation.meta.*
import scala.beans.*

class Person(@JsonbProperty @BeanProperty var name: String)

class User :
  @(JsonbProperty @beanGetter @beanSetter) @BeanProperty var name: String = null
  def display(@nowarn message: String) = ""

@main def demo7 = 
  val fred = new User
  fred.name = "fred"
  val jsonb = JsonbBuilder.create()
  println(jsonb.toJson(fred))
  val json = """{"name" : "fred"}"""
  val p = jsonb.fromJson(json, classOf[User])
  println(p.name)
