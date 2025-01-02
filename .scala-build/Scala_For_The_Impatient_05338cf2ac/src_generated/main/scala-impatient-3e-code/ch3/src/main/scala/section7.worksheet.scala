package scala$minusimpatient$minus3e$minuscode.ch3.src.main.scala


final class section7$u002Eworksheet$_ {
def args = section7$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch3/src/main/scala/section7.worksheet.sc"""
/*<script>*/
val matrix = Array.ofDim[Double](3, 4) // Three rows, four columns
val row = 1
val column = 2
matrix(row)(column) = 42
matrix
val triangle = Array.ofDim[Array[Int]](10)
for i <- triangle.indices do 
  triangle(i) = Array.ofDim[Int](i + 1)                      

/*</script>*/ /*<generated>*//*</generated>*/
}

object section7$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section7$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section7$u002Eworksheet_sc.script as `section7.worksheet`

