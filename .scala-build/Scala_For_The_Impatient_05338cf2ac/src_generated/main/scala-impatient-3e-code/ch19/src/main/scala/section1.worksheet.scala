package scala$minusimpatient$minus3e$minuscode.ch19.src.main.scala


final class section1$u002Eworksheet$_ {
def args = section1$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch19/src/main/scala/section1.worksheet.sc"""
/*<script>*/
// A method with a context parameter
case class QuoteDelimiters(left: String, right: String)

def quote(what: String)(using delims: QuoteDelimiters) =
  delims.left + what + delims.right

// You can pass an explicit context parameter
quote("Bonjour le monde")(using QuoteDelimiters("«", "»")) // Returns «Bonjour le monde»


// But that's not common. There should be a given value:
given englishQuoteDelims : QuoteDelimiters = QuoteDelimiters("“", "”")

// Now you can call without the context parameter
quote("Bonjour le monde")

// It is not a good idea for given values to be global
// Instead, import the right ones as needed
object French :
  given quoteDelims: QuoteDelimiters = QuoteDelimiters("«", "»")
  

object German :
  given quoteDelims: QuoteDelimiters = QuoteDelimiters("„", "“")
  
{
  import German.given

  quote("Bonjour le monde")
}

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

