// Typesafe selection

class Props(props: Map[String, Any]) extends Selectable :
  def selectDynamic(name: String) = props(name)

type Item = Props {
  val description: String
  val price: Double
}

val toaster = Props(Map("description" -> "Blackwell Toaster", "price" -> 29.95)).asInstanceOf[Item]

toaster.price

// This fails at compile-time
// toaster.brand

// Typesafe application
class Request(baseURL: String) extends Selectable :
  def applyDynamic(name: String)(args: Any*): Any =
    val url = s"$baseURL/$name/${args(0)}"
    scala.io.Source.fromURL(url).mkString

type RandomService = Request {
  def nouns(qty: Int) : String
  def adjectives(qty: Int) : String
}

val myRandomService = new Request("https://horstmann.com/random").asInstanceOf[RandomService]

myRandomService.nouns(5)

// This fails at compile-time
// myRandomService.curses(5)
