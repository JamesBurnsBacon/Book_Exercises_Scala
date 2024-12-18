// A type constraint

class Pair[T](val first: T, val second: T)(using ev: T <:< Comparable[T]) :
  def smaller = if first.compareTo(second) < 0 then first else second

val p = Pair("Fred", "Brooks")
p.smaller
