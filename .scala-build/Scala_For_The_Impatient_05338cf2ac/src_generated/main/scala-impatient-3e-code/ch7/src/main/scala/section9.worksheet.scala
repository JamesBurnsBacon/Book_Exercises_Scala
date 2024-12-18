package scala$minusimpatient$minus3e$minuscode.ch7.src.main.scala


final class section9$u002Eworksheet$_ {
def args = section9$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch7/src/main/scala/section9.worksheet.sc"""
/*<script>*/
{
  // Selector syntax
  import java.awt.{Color, Font}

  (Color.RED, Font.getFont("Serif"))
}

{
  // Selectors with renaming
  import java.util.HashMap as JavaHashMap
  import scala.collection.mutable.*
  val map1 = JavaHashMap[String, Int]()
  val map2 =  HashMap[String, Int]()
  (map1.getClass.getName, map2.getClass.getName)
}

{
  // Selectors with hiding
  import java.util.{HashMap as _, *}
  import scala.collection.mutable.*
  val map1 = HashMap[String, Int]()
  val map2 =  Properties()
  (map1.getClass.getName, map2.getClass.getName)
}

/*</script>*/ /*<generated>*//*</generated>*/
}

object section9$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section9$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section9$u002Eworksheet_sc.script as `section9.worksheet`

