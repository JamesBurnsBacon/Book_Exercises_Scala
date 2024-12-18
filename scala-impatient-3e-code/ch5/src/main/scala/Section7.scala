import scala.collection.mutable.ArrayBuffer

// Each instance has a separate nested class
@main def nestedDemo1 =
  class Network :
    class Member(val name: String) :
      val contacts = ArrayBuffer[Member]()  
  
    private val members = ArrayBuffer[Member]()
  
    def join(name: String) =
      val m = Member(name)
      members += m
      m

  val chatter = Network()
  val myFace = Network()

  val fred = chatter.join("Fred")
  val wilma = chatter.join("Wilma")
  fred.contacts += wilma // OK
  val barney = myFace.join("Barney") // Has type myFace.Member

  // fred.contacts += barney 
    // No—can't add a myFace.Member to a buffer of chatter.Member elements

// Here we use a type projection. Each network collects its own members,
// but contacts are members of any network.
@main def nestedDemo2 = 
  class Network :
    class Member(val name: String) :
      val contacts = ArrayBuffer[Network#Member]()  
      
    private val members = ArrayBuffer[Member]()
  
    def join(name: String) =
      val m = new Member(name)
      members += m
      m  

  val chatter = Network()
  val myFace = Network()

  val m = chatter.Member("Fred")

  val fred = chatter.join("Fred")
  val wilma = chatter.join("Wilma")
  fred.contacts += wilma // Ok
  val barney = myFace.join("Barney") 
  fred.contacts += barney // Also ok

// The analog of a "static inner class" is a class inside an object: 
@main def nestedDemo3 = 
  object Network :
    class Member(val name: String) :
      val contacts = ArrayBuffer[Member]()
  
  class Network :
    private val members = ArrayBuffer[Network.Member]()
      
    def join(name: String) =
      val m = new Network.Member(name)
      members += m
      m  

  val chatter = Network()
  val myFace = Network()

  val m = Network.Member("Fred")

  val fred = chatter.join("Fred")
  val wilma = chatter.join("Wilma")
  fred.contacts += wilma // Ok
  val barney = myFace.join("Barney") 
  fred.contacts += barney // Also ok

// You can access the outer instance as Network.this:
@main def nestedDemo4 = 
  class Network(val name: String) :
    class Member(val name: String) :
      val contacts = ArrayBuffer[Member]()
      def description = s"$name inside ${Network.this.name}"
    private val members = ArrayBuffer[Member]()
  
    def join(name: String) =
      val m = new Member(name)
      members += m
      m  

  val chatter = Network("Chatter")
  val myFace = Network("MyFace")

  val fred = chatter.join("Fred")
  println(fred.description);
  val barney = myFace.join("Barney")
  println(barney.description);
