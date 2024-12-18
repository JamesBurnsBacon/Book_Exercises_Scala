package scala$minusimpatient$minus3e$minuscode.ch18.src.main.scala


final class section1$u002Eworksheet$_ {
def args = section1$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch18/src/main/scala/section1.worksheet.sc"""
/*<script>*/
// A union type
def isValid(choice: String, choices: String | Array[String]) =
  choices match
    case str: String => str.split("\\s+").contains(choice)
    case Array(elems*) => elems.contains(choice)

// Call the function with a string or an array
isValid("Bravo", "Alpha Bravo Charlie Delta")
isValid("Baker", Array("Alpha", "Bravo", "Charlie", "Delta"))

// Compare with
enum Choices :
  case StringChoices(str: String)
  case ArrayChoices(elems: String*)

def isValid(choice: String, choices: Choices) =
  choices match
    case Choices.StringChoices(str) => str.split("\\s+").contains(choice)
    case Choices.ArrayChoices(elems*) => elems.contains(choice)

isValid("Bravo", Choices.StringChoices("Alpha Bravo Charlie Delta"))

// Specify union return types explicitly

def inverse(x: Double): Double | String = if x == 0 then "Divide by zero" else 1 / x
inverse(2)
inverse(0)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section1$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section1$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section1$u002Eworksheet_sc.script as `section1.worksheet`

