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
