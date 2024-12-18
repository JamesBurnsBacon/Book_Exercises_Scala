package section13_1

class Item(val description: String, val price: Double) :
  
  final override def equals(other: Any) = 
    other.isInstanceOf[Item] && {
      val that = other.asInstanceOf[Item]
      description == that.description && price == that.price
    }

@main def demo1 =
  val item1 = Item("Toaster", 29.95)
  val item2 = Item("Toaster", 29.95)
  val item3 = Item("Espresso machine", 199.95)

  println(item1 == item2)
  println(item1 == item3)
