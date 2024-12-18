import scala.compiletime.*

inline def run[T](inline task: => T, profile: Boolean) =
  var start: Long = 0
  inline if profile then start = System.nanoTime()
  val result = task
  inline if profile then
    val end = System.nanoTime()
    println(f"Duration of ${codeOf(task)}: ${(end - start) * 1E-9}%.3f")
  result

inline def sizeof[T <: Matchable] =
  inline erasedValue[T] match
    case _: Boolean => 1
    case _: Byte    => 1
    case _: Char    => 2
    case _: Short   => 2
    case _: Int     => 4
    case _: Float   => 4
    case _: Long    => 8
    case _: Double  => 8
    case _ => error("Not a primitive type")

transparent inline def defaultValue[T <: Matchable] =
  inline erasedValue[T] match
    case _: Boolean => false
    case _: Byte    => 0.asInstanceOf[Byte]
    case _: Char    => '\u0000'
    case _: Short   => 0.asInstanceOf[Short]
    case _: Int     => 0
    case _: Float   => 0.0f
    case _: Long    => 0L
    case _: Double  => 0.0
    case _ => error("Not a primitive type")

inline def mkString[T <: Tuple](inline args: T, separator: String): String =
  inline args match
    case EmptyTuple => ""
    case t1: (? *: EmptyTuple) => t1.head.toString
    case t2: NonEmptyTuple =>  t2.head.toString + separator + mkString(t2.tail, separator)

def inlineDemo1a =
  println("Profiling on")
  println(run(Thread.sleep(1000), true))

def inlineDemo1b =
  println("Profiling off")
  println(run(Thread.sleep(1000), false))

def inlineDemo2 =
  println("Inline matches")
  val df = defaultValue[Float]
  println(s"Float has size ${sizeof[Float]} and a default of {df}")

def inlineDemo3 =
  println("Recursive inline")
  val str = mkString(("Fred", 42), ", ")
  println(str)

@main def inlineDemo =
  inlineDemo1a
  inlineDemo1b
  inlineDemo2
  inlineDemo3
