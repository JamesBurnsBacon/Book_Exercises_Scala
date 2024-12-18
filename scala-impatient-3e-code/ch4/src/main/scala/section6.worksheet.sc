import scala.jdk.CollectionConverters.*
val ids = java.time.ZoneId.SHORT_IDS.asScala
  // Yields a scala.collection.mutable.Map[String, String]
val props = System.getProperties.asScala
  // Yields a Map[String, String], not a Map[Object, Object]
import java.awt.font.TextAttribute.* // Import keys for map below
val attrs = Map(FAMILY -> "Serif", SIZE -> 12) // A Scala map
val font = java.awt.Font(attrs.asJava) // Expects a Java map
