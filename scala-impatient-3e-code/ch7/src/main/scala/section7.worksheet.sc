{
  // Importing a single member

  import java.awt.Color
  Color.RED
}

{
  // * wildcard

  import java.awt.*
  (Color.RED, Font.getFont("Serif"))
}

{
  // Importing the members of a class

  import java.awt.Color.*
  val c1 = RED // Color.RED
  val c2 = decode("#ff0000") // Color.decode
  (c1, c2)
}

{
  // Importing a subpackage

  import java.awt.*
  
  val transform = geom.AffineTransform.getScaleInstance(0.5, 0.5)
    // java.awt.geom.AffineTransform
  transform
}
