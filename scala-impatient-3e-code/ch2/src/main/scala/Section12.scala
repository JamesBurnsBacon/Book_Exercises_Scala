import java.io.*
import java.net.*
import java.nio.file.*
import javax.imageio.*
import javax.swing.*

def root(x: Double) = 
  if x >= 0 then scala.math.sqrt(x) 
  else throw IllegalArgumentException("x should not be negative")

def process(u: URL) =
  val img = ImageIO.read(u)
  JOptionPane.showMessageDialog(null, null, null, 0, new ImageIcon(img))

def process(in: InputStream) =
  val img = ImageIO.read(in)
  JOptionPane.showMessageDialog(null, null, null, 0, new ImageIcon(img))

def process(in: Reader, out: Writer) = 
  in.transferTo(out)

@main def demo12_1() = 
  try
    println(root(4))
    println(root(-4))
    println(root(0))
  catch
    case ex: Exception => println(ex)

@main def demo12_2() = 
  val url = URL("http://horstmann.com/fred.gif")
  try
    process(url)
  catch
    case _: MalformedURLException => println(s"Bad URL: $url")
    case ex: IOException => println(ex)

  try
    val in = URL("http://horstmann.com/cay-tiny.gif").openStream()
    try
      process(in)
    finally
      println("Closing input stream")
      in.close()
  catch
    case ex: Exception => println(ex)

@main def demo12_3() =
  import scala.io.*
  import scala.util.*
  val result =
    for
      a <- Try { StdIn.readLine("a: ").toInt }
      b <- Try { StdIn.readLine("b: ").toInt }
    yield a / b

def openReader(path: String) = 
  new FileReader(new File(path)) :
    override def close() = 
      super.close()
      println("Closed " + path)       

def openWriter(path: String) = 
  new FileWriter(new File(path)) :
    override def close() = 
      super.close()
      println("Closed " + path)        

@main def demo12_4() =
  val inPath = "/usr/share/dict/words"
  val outPath = "/tmp/words"
  import scala.util.*
  Using.Manager { use =>
    val in = use(openReader(inPath))
    val out = use(openWriter(outPath))
    // Read from in, write to out
    process(in, out)
  } // The reader and writer are closed
