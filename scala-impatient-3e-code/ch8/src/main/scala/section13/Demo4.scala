package section13_4

class Item(val description: String, val price: Double) :
  
  final override def equals(other: Any) = 
    other.isInstanceOf[Item] && {
      val that = other.asInstanceOf[Item]
      description == that.description && price == that.price
    }
  // Observe what happens if you comment out the hashCode below
  final override def hashCode = (description, price).##
  override def toString = getClass.getName + "[description=" + 
    description + ",price=" + price + "]"

@main def demo4 =
  val item1 = Item("Toaster", 29.95)
  val item2 = Item("Toaster", 29.95)
  val item3 = Item("Espresso machine", 199.95)

  val items = scala.collection.mutable.HashSet[Item]()
  items.add(item1)
  items.add(item2)
  items.add(item3)
  println(items)
