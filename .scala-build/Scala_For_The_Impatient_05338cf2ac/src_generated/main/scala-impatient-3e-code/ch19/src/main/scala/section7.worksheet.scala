package scala$minusimpatient$minus3e$minuscode.ch19.src.main.scala


final class section7$u002Eworksheet$_ {
def args = section7$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch19/src/main/scala/section7.worksheet.sc"""
/*<script>*/
import java.io.File
import java.nio.file.Files

// Four places for extension methods

// 1. In the scope of the call
{
  object FileOps : // or package
    extension(f: File)
      def read = Files.readString(f.toPath)
  
  import FileOps.* // or import FileOps.read
  File("/usr/share/dict/words").read
}
{
  trait FileOps :
    extension(f: File)
      def read = Files.readString(f.toPath)
  
  class Task extends FileOps :
    def call() =
      File("/usr/share/dict/words").read

  Task().call()
}



// 2. In the "implicit scope", i.e. companion object(s)
{
  case class Pair[T](first: T, second: T)
  
  object Pair :
    extension [T](pp: Pair[Pair[T]])
      def zip = Pair(Pair(pp.first.first, pp.second.first), Pair(pp.first.second, pp.second.second))
  
  val obj = Pair(Pair(1, 2), Pair(3, 4))
  obj.zip // Pair(Pair(1, 3), Pair(2, 4))
}

case class Pair[T](first: T, second: T)
trait JSON[T] :
  extension (t: T) def stringify: String

object JSON :
  given JSON[Double] with
    extension (x: Double)
      def stringify = x.toString
  def escape(s: String) = s.flatMap(
    Map('\\' -> "\\\\", '"' -> "\\\"", '\n' -> "\\n", '\r' -> "\\r").withDefault(_.toString))
  given JSON[String] with
    extension (s: String)
      def stringify = s""""${escape(s)}""""
object Pair :
  given [T : JSON] : JSON[Pair[T]] with
    extension (p: Pair[T])
      def stringify: String = s"""{"first": ${p.first.stringify}, "second": ${p.second.stringify}}"""

// 3. In a given instance in scope
// Look carefully at p.first.stringify above. 

// 4. In a given instance in the implicit scope

Pair(1.7, 2.9).stringify

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

