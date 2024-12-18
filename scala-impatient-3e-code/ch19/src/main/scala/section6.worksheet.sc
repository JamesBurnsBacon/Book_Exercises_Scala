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
