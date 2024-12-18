package section14

class Item(val description: String, val price: Double) derives CanEqual :
  
  final override def equals(other: Any) = 
    other.isInstanceOf[Item] && {
      val that = other.asInstanceOf[Item]
      description == that.description && price == that.price
    }

@main def demo1 =
  val item1 = Item("Toaster", 29.95)
  val item2 = Item("Toaster", 29.95)

  var result = item1 == item2
  // Comment out the next line to see the error message
  // result = Item("Blackwell toaster", 29.95) == Product("Blackwell toaster") // Compile-time error
  println(result)

class Person(val name: String)
class User(val id: Int)

@main def demo2 = 
  // Comment out the next line to see the error messages
  // import scala.language.strictEquality
  val fred = Person("Fred")
  println(fred == User(1729))
  println(fred == fred)
