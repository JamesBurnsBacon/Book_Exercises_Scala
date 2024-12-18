package scala$minusimpatient$minus3e$minuscode.ch14.src.main.scala


final class section1$u002Eworksheet$_ {
def args = section1$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch14/src/main/scala/section1.worksheet.sc"""
/*<script>*/
// A better switch

for (c <- "+-!") yield
  val ch: Char = c
  var sign = 0
  ch match
    case '+' => sign = 1
    case '-' => sign = -1
    case _ => sign = 0
  sign

// match is an expression

for (ch <- "+-!") yield
  val sign = ch match
    case '+' => 1
    case '-' => -1
    case _ => 0
  sign

// Separate cases with |

for (prefix <- Array("0x", "0X", "0", "")) yield
  prefix match
    case "0x" | "0X"  => 16
    case "0" => 8
    case _ => 10

// Works with any types

import java.awt.*
for (color <- Array(Color.RED, Color.GREEN, Color.BLUE, Color.BLACK)) yield
  color match
    case Color.RED => 0xff0000
    case Color.GREEN => 0xff00
    case Color.BLUE => 0xff

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

