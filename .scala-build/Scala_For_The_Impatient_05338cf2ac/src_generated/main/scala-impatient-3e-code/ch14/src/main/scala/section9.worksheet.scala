package scala$minusimpatient$minus3e$minuscode.ch14.src.main.scala


final class section9$u002Eworksheet$_ {
def args = section9$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch14/src/main/scala/section9.worksheet.sc"""
/*<script>*/
// A pattern can be used to declare variables in "for" expressions

import scala.jdk.CollectionConverters.*
  // Converts Java Properties to a Scala map—just to get an interesting example
for (k, v) <- System.getProperties.asScala do
  println(s"$k -> $v")

// Use "for case" to skip match errors

for case (k, "UTF-8") <- System.getProperties.asScala
  yield k

// A guard comes at the end

for (k, v) <- System.getProperties.asScala if v == "UTF-8"
  yield k

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

