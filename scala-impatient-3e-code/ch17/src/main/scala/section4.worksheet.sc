// A context bound

class Pair[T : Ordering](val first: T, val second: T) :
  def smaller(using ord: Ordering[T]) =
    if ord.compare(first, second) < 0 then first else second

val p = Pair("Fred", "Brooks")
p.smaller
