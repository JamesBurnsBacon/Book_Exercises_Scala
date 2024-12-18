package scala$minusimpatient$minus3e$minuscode.ch18.src.main.scala


final class section8$u002Eworksheet$_ {
def args = section8$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch18/src/main/scala/section8.worksheet.sc"""
/*<script>*/
// Dependent types

// Start with the Reader from the preceding section
import java.awt.image.BufferedImage
import java.net.URL
import javax.imageio.ImageIO
import javax.swing.*

trait Reader :
  type Contents
  def read(url: String): Contents

class StringReader extends Reader :
  type Contents = String
  def read(url: String) = String(URL(url).openStream.readAllBytes)

class ImageReader extends Reader :
  type Contents = BufferedImage
  def read(url: String) = ImageIO.read(URL(url))

// We want to make a component from the contents
// Note the dependent type r.Contents

def makeComponent(r: Reader, url: String, transform: r.Contents => JComponent) = 
  val contents = r.read(url)
  transform(contents)

val ir = ImageReader()
val imageLabel = makeComponent(ir, "https://horstmann.com/cay-tiny.gif", b => JLabel(ImageIcon(b)))

JOptionPane.showMessageDialog(null, imageLabel)

// This function has a dependent type (r: Reader, url: String) => r.Contents

val readContents = (r: Reader, url: String) => r.read(url)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section8$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section8$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section8$u002Eworksheet_sc.script as `section8.worksheet`

