package section5

class Person(val name: String) :
  def greeting = s"Hello, my name is $name"

@main def demo =
  val alien = new Person("Tweel") :
    override def greeting = "Greetings, Earthling!"
  println(alien.greeting)
