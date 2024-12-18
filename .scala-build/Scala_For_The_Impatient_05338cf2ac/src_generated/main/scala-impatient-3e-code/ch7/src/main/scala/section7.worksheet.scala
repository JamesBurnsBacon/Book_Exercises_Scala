package scala$minusimpatient$minus3e$minuscode.ch7.src.main.scala


final class section7$u002Eworksheet$_ {
def args = section7$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch7/src/main/scala/section7.worksheet.sc"""
/*<script>*/
{
  // Importing a single member

  import java.awt.Color
  Color.RED
}

{
  // * wildcard

  import java.awt.*
  (Color.RED, Font.getFont("Serif"))
}

{
  // Importing the members of a class

  import java.awt.Color.*
  val c1 = RED // Color.RED
  val c2 = decode("#ff0000") // Color.decode
  (c1, c2)
}

{
  // Importing a subpackage

  import java.awt.*
  
  val transform = geom.AffineTransform.getScaleInstance(0.5, 0.5)
    // java.awt.geom.AffineTransform
  transform
}

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

