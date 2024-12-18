package scala$minusimpatient$minus3e$minuscode.ch11.src.main.scala


final class section12$u002Eworksheet$_ {
def args = section12$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch11/src/main/scala/section12.worksheet.sc"""
/*<script>*/
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

/*</script>*/ /*<generated>*//*</generated>*/
}

object section12$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section12$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section12$u002Eworksheet_sc.script as `section12.worksheet`

