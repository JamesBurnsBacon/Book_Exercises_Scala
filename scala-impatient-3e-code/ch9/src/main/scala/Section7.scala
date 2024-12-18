import java.io.*

@main def demo7 =
  @SerialVersionUID(42L) class Person(val name: String) extends Serializable
  val fred = Person("Fred")
  val out = ObjectOutputStream(FileOutputStream("/tmp/test.ser"))
  out.writeObject(fred)
  out.close()
  val in = ObjectInputStream(FileInputStream("/tmp/test.ser"))
  val savedFred = in.readObject().asInstanceOf[Person]
  println(savedFred.name)
