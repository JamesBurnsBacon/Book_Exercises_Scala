import scala.collection.mutable.*
import java.awt.*
import java.awt.geom.*
import javax.swing.*
import java.io.*

// An intersection type
val img = ArrayBuffer[java.awt.Shape & java.io.Serializable]

val rect = Rectangle(5, 10, 20, 30)
img += rect // OK—java.awt.Rectangle is a Shape and Serializable
img += Ellipse2D.Double(20, 10, 50, 30)
// This does not work:
// img += Area(rect) // Error—java.awt.Area is a Shape but not Serializable

// The elements are shapes
val icon = new Icon :
  override def getIconWidth = 100
  override def getIconHeight = 100
  override def paintIcon(c: Component, g: Graphics, x: Int, y: Int) =
    val graphics = g.asInstanceOf[Graphics2D]
    for (s <- img) graphics.draw(s)
    
javax.swing.JOptionPane.showMessageDialog(
  null, "", "", javax.swing.JOptionPane.INFORMATION_MESSAGE, icon)

// The elements are serializable
val bout = ByteArrayOutputStream()
val oout = ObjectOutputStream(bout)
oout.writeObject(img)
oout.close()
val bin = ByteArrayInputStream(bout.toByteArray)
val oin = ObjectInputStream(bin)
oin.readObject().asInstanceOf[ArrayBuffer[java.awt.Shape & java.io.Serializable]]
