// Type constraints that cannot be expressed as type bounds

class Pair[T](val first: T, val second: T) :
  def smaller(using ev: T <:< Comparable[T]) =
    if first.compareTo(second) < 0 then first else second

val p = Pair("Fred", "Brooks")
p.smaller

// We can form a pair of non-comparable URLs as long as we don't call smaller

import java.net.URL
val url1 = URL("http://scala-lang.org")
val url2 = URL("http://horstmann.com")
val p2 = Pair(url1, url2) // Ok

// p2.smaller // Error

val friends = Map("Fred" -> "Barney", "Dino" -> "Wilma")
val friendOpt = friends.get("Wilma") // An Option[String] 
val friendOrNull = friendOpt.orNull // A String or null

// orNull has a constraint Null <:< A, so it can't be applied to Option[Int]
/*
val numberOpt = if scala.math.random() < 0.5 then Some(42) else None
val number: Int = numberOpt.orNull // Error
*/
