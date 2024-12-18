/*

scala3-compiler -classpath $(coursier fetch --classpath org.eclipse:yasson:2.0.4) src/main/scala/section1/Demo.scala
scala3 -classpath $(coursier fetch --classpath org.eclipse:yasson:2.0.4) demo1

*/
package section1
import jakarta.json.bind.*
import jakarta.json.bind.annotation.*

case class Person @JsonbCreator (
  @JsonbProperty val name: String,
  @JsonbProperty val age: Int)

@main def demo1 =
  val jsonb = JsonbBuilder.create()
  val json = """{"name" : "Fred", "age" : 42 }"""
  println(jsonb.fromJson(json, classOf[Person]))
