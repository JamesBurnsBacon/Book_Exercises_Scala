Array("Mary", "had", "a", "little", "lamb")
Array.apply("Mary", "had", "a", "little", "lamb")
class Person(val name: String, val age: Int)
val p = Person("Fred", 42)
val q = Person.apply("Wilma", 39)
val seasons = Map("Spring" -> 1, "Summer" -> 2, "Fall" -> 3, "Winter" -> 4)
seasons.getClass // Yields class scala.collection.immutable.Map$Map4
val directions = Map("Center" -> 0, "North" -> 1, "East" -> 2, "South" -> 3, "West" -> 4)
directions.getClass // Yields class scala.collection.immutable.HashMap
