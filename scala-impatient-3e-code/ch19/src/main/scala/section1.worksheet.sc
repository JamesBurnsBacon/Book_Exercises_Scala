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
