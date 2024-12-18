package scala$minusimpatient$minus3e$minuscode.ch13.src.main.scala


final class section13$u002Eworksheet$_ {
def args = section13$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch13/src/main/scala/section13.worksheet.sc"""
/*<script>*/
import java.nio.file.*
import scala.collection.mutable.Buffer
import scala.jdk.CollectionConverters.*
val props = System.getProperties.asScala
props("com.horstmann.scala") = "impatient"
props
import scala.jdk.StreamConverters.*
val filename = "/usr/share/dict/words"
val lineBuffer = Files.lines(Path.of(filename)).toScala(Buffer)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section13$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section13$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section13$u002Eworksheet_sc.script as `section13.worksheet`

