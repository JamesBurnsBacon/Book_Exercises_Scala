package scala$minusimpatient$minus3e$minuscode.ch19.src.main.scala


final class section6$u002Eworksheet$_ {
def args = section6$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch19/src/main/scala/section6.worksheet.sc"""
/*<script>*/
import java.io.File
import java.nio.file.{Path, Files}

// Adding a read method to the File class
extension (f: File)
  def read = Files.readString(f.toPath)

val contents = File("/usr/share/dict/words").read

// An operator extension

extension (s: String)
  def -(t: String) = s.replace(t, "")

"units" - "u"

// A parameterized extension

extension [T <: Comparable[? >: T]](x: T)
  def <(y: T) = x.compareTo(y) < 0

"Hello" < "World"
// List(1) < List(2) // Doesn't apply since List is not Comparable

// Multiple extensions
{
  extension (f: File)
    def read = Files.readString(f.toPath)
    def write(contents: String) = Files.writeString(f.toPath, contents)

  val f = File("/tmp/greeting.txt")
  f.write("Hello, World!")
  f.read
}

// An export clause can add multiple methods

extension (f: File)
  def path = f.toPath
  export path.*

// All Path methods apply to File objects


val home = File("")
home.toAbsolutePath() // On my computer, that is Path("/home/cay")

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

