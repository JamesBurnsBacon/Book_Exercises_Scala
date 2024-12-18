package section13_2

// Using match instead of asInstanceOf
class Item(val description: String, val price: Double) :
  final override def equals(other: Any) = other match 
    case that: Item => description == that.description && price == that.price
    case _ => false

@main def demo2 =
  val item1 = Item("Toaster", 29.95)
  val item2 = Item("Toaster", 29.95)
  val item3 = Item("Espresso machine", 199.95)

  println(item1 == item2)
  println(item1 == item3)
