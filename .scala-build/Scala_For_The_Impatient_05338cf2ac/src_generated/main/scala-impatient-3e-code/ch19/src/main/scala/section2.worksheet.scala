package scala$minusimpatient$minus3e$minuscode.ch19.src.main.scala


final class section2$u002Eworksheet$_ {
def args = section2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch19/src/main/scala/section2.worksheet.sc"""
/*<script>*/
import java.text.*
case class QuoteDelimiters(left: String, right: String)

// This language object has a message map
case class Messages(templates: Map[String, String])

object French :
  given quoteDelims: QuoteDelimiters = QuoteDelimiters("«", "»")
  given msgs: Messages
    = Messages(Map("greeting" -> "Bonjour {0}!", "attributedQuote" -> "{0} a dit {1}{2}{3}"))

import French.given

// A using parameter without a name
def attributedQuote(who: String, what: String)(using QuoteDelimiters) =
  s"$who said: ${quote(what)}"

// You can explicitly summon a given instance. 
def quote(what: String)(using QuoteDelimiters) =
  summon[QuoteDelimiters].left + what + summon[QuoteDelimiters].right

attributedQuote("Thomas Carlyle", "No pressure, no diamonds.")

// This method has two using parameters
{
  def attributedQuote(who: String, what: String)(using delims: QuoteDelimiters, msgs: Messages) =
    MessageFormat.format(msgs.templates("attributedQuote"), who, delims.left, what, delims.right)

  attributedQuote("Thomas Carlyle", "No pressure, no diamonds.")
}

// You can curry the using parameters
{
  def attributedQuote(who: String, what: String)(using delims: QuoteDelimiters)(using msgs: Messages) = 
    MessageFormat.format(msgs.templates("attributedQuote"), who, delims.left, what, delims.right)

  attributedQuote("Victor Hugo", "La liberté commence où l'ignorance finit.")
}

/*</script>*/ /*<generated>*//*</generated>*/
}

object section2$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section2$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section2$u002Eworksheet_sc.script as `section2.worksheet`

