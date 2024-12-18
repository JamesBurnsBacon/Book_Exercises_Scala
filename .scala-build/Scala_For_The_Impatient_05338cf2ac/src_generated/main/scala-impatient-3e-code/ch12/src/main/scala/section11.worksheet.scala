package scala$minusimpatient$minus3e$minuscode.ch12.src.main.scala


final class section11$u002Eworksheet$_ {
def args = section11$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch12/src/main/scala/section11.worksheet.sc"""
/*<script>*/
package section11

// Nonlocal returns

def until(condition: => Boolean)(block: => Unit): Unit =
  if !condition then
    block
    until(condition)(block)

def indexOf(str: String, ch: Char): Int = 
  var i = 0
  until (i == str.length) { 
    if str(i) == ch then return i
    i += 1
  }
  -1

indexOf("Hello", 'l')

/*</script>*/ /*<generated>*//*</generated>*/
}

object section11$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section11$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section11$u002Eworksheet_sc.script as `section11.worksheet`

