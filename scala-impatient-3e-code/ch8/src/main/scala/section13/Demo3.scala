package section13_3

// Overriding the wrong equals
class Item(val description: String, val price: Double) :
  final def equals(other: Item) = other.isInstanceOf[Item] && { // Don't!
      val that = other.asInstanceOf[Item]
      description == that.description && price == that.price
    }

@main def demo3 =
  val item1 = Item("Toaster", 29.95)
  val item2 = Item("Toaster", 29.95)
  val item3 = Item("Espresso machine", 199.95)

  println(item1 == item2)
  println(item1 == item3)
