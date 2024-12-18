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
