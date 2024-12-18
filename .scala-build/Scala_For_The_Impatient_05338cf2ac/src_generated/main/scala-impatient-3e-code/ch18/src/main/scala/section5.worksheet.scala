package scala$minusimpatient$minus3e$minuscode.ch18.src.main.scala


final class section5$u002Eworksheet$_ {
def args = section5$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch18/src/main/scala/section5.worksheet.sc"""
/*<script>*/
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

/*</script>*/ /*<generated>*//*</generated>*/
}

object section5$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section5$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section5$u002Eworksheet_sc.script as `section5.worksheet`

