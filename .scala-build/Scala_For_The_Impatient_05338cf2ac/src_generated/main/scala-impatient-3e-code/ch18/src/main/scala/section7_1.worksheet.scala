package scala$minusimpatient$minus3e$minuscode.ch18.src.main.scala


final class section7_1$u002Eworksheet$_ {
def args = section7_1$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch18/src/main/scala/section7_1.worksheet.sc"""
/*<script>*/
// Abstract types
import java.awt.image.BufferedImage
import java.net.URL
import javax.imageio.ImageIO

trait Reader :
  type Contents
  def read(url: String): Contents

class StringReader extends Reader :
  type Contents = String
  def read(url: String) = String(URL(url).openStream.readAllBytes)

class ImageReader extends Reader :
  type Contents = BufferedImage
  def read(url: String) = ImageIO.read(URL(url))
val str = StringReader().read("https://horstmann.com/random/noun").trim
val img = ImageReader().read("https://www.scala-lang.org/resources/img/frontpage/scala-spiral.png")

javax.swing.JOptionPane.showMessageDialog(
  null, str, str, javax.swing.JOptionPane.INFORMATION_MESSAGE, javax.swing.ImageIcon(img))

/*</script>*/ /*<generated>*//*</generated>*/
}

object section7_1$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section7_1$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section7_1$u002Eworksheet_sc.script as `section7_1.worksheet`

