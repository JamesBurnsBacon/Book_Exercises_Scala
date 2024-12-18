package scala$minusimpatient$minus3e$minuscode.ch18.src.main.scala


final class section7_2$u002Eworksheet$_ {
def args = section7_2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch18/src/main/scala/section7_2.worksheet.sc"""
/*<script>*/
// Using type parameters instead of abstract types
import java.awt.image.BufferedImage
import java.net.URL
import javax.imageio.ImageIO
import javax.swing.*

trait Reader[C] :
  def read(url: String): C

class StringReader extends Reader[String] :
  def read(url: String) = String(URL(url).openStream.readAllBytes)

class ImageReader extends Reader[BufferedImage] :
  def read(url: String) = ImageIO.read(URL(url))
val str = StringReader().read("https://horstmann.com/random/noun").trim
val img = ImageReader().read("https://www.scala-lang.org/resources/img/frontpage/scala-spiral.png")

JOptionPane.showMessageDialog(
  null, str, str, JOptionPane.INFORMATION_MESSAGE, javax.swing.ImageIcon(img))

/*</script>*/ /*<generated>*//*</generated>*/
}

object section7_2$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section7_2$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section7_2$u002Eworksheet_sc.script as `section7_2.worksheet`

