package section5
import scala.annotation.*
import java.util.{Map as _, _}

object Util :
  def sum(xs: Seq[Int]): BigInt =
    if (xs.isEmpty) BigInt(0) else xs.head + sum(xs.tail)
  @tailrec 
  def sum2(xs: Seq[Int], partial: BigInt): BigInt =
    if (xs.isEmpty) partial else sum2(xs.tail, xs.head + partial)

/*
// This does not work
class Util :
  @tailrec def sum3(xs: Seq[Int], partial: BigInt): BigInt =
    if (xs.isEmpty) partial else sum3(xs.tail, xs.head + partial)
  
*/

import scala.util.control.TailCalls.*
def evenLength(xs: Seq[Int]): TailRec[Boolean] =
  if (xs.isEmpty) done(true) else tailcall(oddLength(xs.tail))
def oddLength(xs: Seq[Int]): TailRec[Boolean] =
  if (xs.isEmpty) done(false) else tailcall(evenLength(xs.tail))

def threadSafe() =
  lazy val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString.split("\n")
  val generator = Random()
  for i <- 1 to 10 do
    val r = new Runnable :
      def run() = 
        println(s"$i: ${words(generator.nextInt(words.length))}")

def notThreadSafe() =
  @threadUnsafe lazy val words =
    scala.io.Source.fromFile("/usr/share/dict/words").mkString.split("\n")
  val generator = Random()
  for i <- 1 to 10 do
    println(s"$i: ${words(generator.nextInt(words.length))}")

@main def demo5 = 
  // No tail recursion
  try 
    val result1 = Util.sum(1 to 1000000)
    println(result1)
  catch 
    case _: StackOverflowError => println("Stack overflow")
  // Tail recursion
  val result2 = Util.sum2(1 to 1000000, 0)
  println(result2)
  // Trampoline
  val result3 = evenLength(1 to 1000000).result
  println(result3)
  threadSafe()
  notThreadSafe()
  println(allDifferent(2, 1, 2))
