package scala$minusimpatient$minus3e$minuscode.ch11.src.main.scala


final class section6$u002Eworksheet$_ {
def args = section6$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch11/src/main/scala/section6.worksheet.sc"""
/*<script>*/
// Associativity
// The following two are the same:
1 :: 2 :: Nil
1 :: (2 :: Nil)

// The following two are the same:
2 :: Nil
Nil.::(2)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section6$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section6$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section6$u002Eworksheet_sc.script as `section6.worksheet`

