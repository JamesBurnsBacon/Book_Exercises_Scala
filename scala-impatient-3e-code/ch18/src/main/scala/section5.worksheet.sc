// A type with exactly one value
type Zero = 0

// A variable of this type can hold just that value
val z: Zero = 0

// Can be useful for a union type
type Bit = 0 | 1
var b: Bit = 0
b = 1 // Ok

// This is an error
// b = -1 // Error

// Check at compile-time that only strings of the same language are combined

class Message[L <: String](val text: String)
val m1 = Message["de"]("Achtung") // m1 has type Message["de"]

class Messages[L <: String] :
  private val sb = StringBuilder()
  def append(message: Message[L]) = sb.append(message.text).append("\n")
  def text = sb.toString

val germanNews = Messages["de"]()
germanNews.append(m1) // Ok to add message with the same language

// This is an error
// val m2 = Message["en"]("Hello")
germanNews.append(m2) // Error

{
  // Note the wideing to Message[String]
  def message[L <: String](language: L, text: String) = Message[L](text)
}
{
  // Remedy: Singleton bound
  def message[L <: String & Singleton](language: L, text: String) = Message[L](text)
}
