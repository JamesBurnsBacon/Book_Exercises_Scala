// The replaceFirst method without a lower bound

class Pair[T](val first: T, val second: T) :
  def replaceFirst(newFirst: T) = Pair[T](newFirst, second)
  override def toString = s"($first, $second)"

val p = Pair("Fred", "Brooks")
p.replaceFirst("Wilma")
