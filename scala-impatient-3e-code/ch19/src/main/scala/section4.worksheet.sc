case class QuoteDelimiters(left: String, right: String)

def quote(what: String)(using delims: QuoteDelimiters) =
  delims.left + what + delims.right

val text = "Bonjour le monde"

// A given is provided in each iteration of this for/yield statement
val delims = List(QuoteDelimiters("“", "”"), QuoteDelimiters("«", "»"), QuoteDelimiters("„", "“"))
for given QuoteDelimiters <- delims yield
  quote(text)

// A given is provided in the right hand of the case =>
val p = (text, QuoteDelimiters("«", "»"))
p match
  case (t, given QuoteDelimiters) => quote(t)

// A silly example to show the @ syntax for naming the given instance 
for d @ given QuoteDelimiters <- delims yield
  quote(d.left + d.right)

p match
  case (t, d @ given QuoteDelimiters) => quote(d.left + d.right)
