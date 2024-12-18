package scala$minusimpatient$minus3e$minuscode.ch6.src.main.scala


final class section4$u002Eworksheet$_ {
def args = section4$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch6/src/main/scala/section4.worksheet.sc"""
/*<script>*/
Array("Mary", "had", "a", "little", "lamb")
Array.apply("Mary", "had", "a", "little", "lamb")
class Person(val name: String, val age: Int)
val p = Person("Fred", 42)
val q = Person.apply("Wilma", 39)
val seasons = Map("Spring" -> 1, "Summer" -> 2, "Fall" -> 3, "Winter" -> 4)
seasons.getClass // Yields class scala.collection.immutable.Map$Map4
val directions = Map("Center" -> 0, "North" -> 1, "East" -> 2, "South" -> 3, "West" -> 4)
directions.getClass // Yields class scala.collection.immutable.HashMap

/*</script>*/ /*<generated>*//*</generated>*/
}

object section4$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section4$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section4$u002Eworksheet_sc.script as `section4.worksheet`

