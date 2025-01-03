@main def demo1 =
  val fred = com.horstmann.people.Employee("Fred", 100_000)
  val wilma = com.horstmann.people.Manager("Wilma")
  println(s"fred: ${fred.description}")
  println(s"wilma: ${wilma.description}")
  val user = com.horstmann.users.User("fred", "secret")
  println(s"user: ${user.description}")

//compilation fails because horstmann is not a member of com
