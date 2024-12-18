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
