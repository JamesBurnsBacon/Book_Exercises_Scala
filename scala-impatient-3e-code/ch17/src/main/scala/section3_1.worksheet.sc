/*
// This won't work because T might not have a compareTo method
class Pair[T](val first: T, val second: T) :
  def smaller = if first.compareTo(second) < 0 then first else second // Error
*/
// Use a bound to guarantee that T is a subtype of Comparable[T]
class Pair[T <: Comparable[T]](val first: T, val second: T) :
  def smaller = if first.compareTo(second) < 0 then first else second
  override def toString = s"($first, $second)"

val p = Pair("Fred", "Brooks")
p.smaller // "Brooks"
Pair(4, 2)

/*
// Because URL isn't a subtype of Comparable[URL], you cannot form pairs of URL instances
import java.net.URL
val url1 = URL("http://scala-lang.org")
val url2 = URL("http://horstmann.com")
val p2 = Pair(url1, url2) // Error
*/

// The result is a Pair[Integer], not a Pair[Int]
val p3 = Pair(4, 2)
