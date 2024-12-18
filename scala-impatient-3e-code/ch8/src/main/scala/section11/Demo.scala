package section11

class Creature :
  val range: Int = 10
  val env: Array[Int] = Array[Int](range)

class Ant extends Creature :
  override val range = 2

@main def demo = 
  val a = new Ant
  println(a.range)
  println(a.env.length)
