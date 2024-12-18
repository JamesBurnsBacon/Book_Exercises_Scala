package section13_5

// This demo shows why you shouldn't override ==
 
class Item(val description: String, val price: Double) :
  final def ==(other: Item) = // Don't supply == instead of equals!
    description == other.description && price == other.price
  override def toString = getClass.getName + "[description=" + 
    description + ",price=" + price + "]"

@main def demo5 =
  val item1 = Item("Toaster", 29.95)
  val item2 = Item("Toaster", 29.95)
  val item3 = Item("Espresso machine", 199.95)

  println(item1 == item2)
  println(item1 == item3)

  val items = scala.collection.mutable.HashSet[Item]()
  items.add(item1)
  items.add(item2)
  items.add(item3)
  println(items)
