package scala$minusimpatient$minus3e$minuscode.ch2.src.main.scala


final class section2$u002Eworksheet$_ {
def args = section2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch2/src/main/scala/section2.worksheet.sc"""
/*<script>*/
// Use a semicolon to separate two statements on the same line:
var n = 10
var r = 1
if n > 0 then { r = r * n; n -= 1 }

// Break a long line so that the parser can see that it is incomplete:
var s = 0.0
var v = 10.0
var a = 0.2
var t = 0.01
s = s + v * t + // The + tells the parser that this is not the end 
  0.5 * a * t * t

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

