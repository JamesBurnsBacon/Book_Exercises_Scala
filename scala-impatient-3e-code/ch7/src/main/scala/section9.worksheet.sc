{
  // Selector syntax
  import java.awt.{Color, Font}

  (Color.RED, Font.getFont("Serif"))
}

{
  // Selectors with renaming
  import java.util.HashMap as JavaHM
  import scala.collection.mutable.*
  val map1 = JavaHM[String, Int]()
  val map2 =  HashMap[String, Int]()
  (map1.getClass.getName, map2.getClass.getName)
}

{
  // Selectors with hiding, use when names overlap
  import java.util.{HashMap as _, *}
  import scala.collection.mutable.*
  val map1 = HashMap[String, Int]()
  val map2 =  Properties()
  (map1.getClass.getName, map2.getClass.getName)
}
