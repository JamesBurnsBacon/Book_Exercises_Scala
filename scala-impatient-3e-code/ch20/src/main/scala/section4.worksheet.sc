import scala.compiletime.ops.int.*
import scala.compiletime.ops.any.*

class Vec[N <: Int](using n: ValueOf[N]) :
  private val xs: Array[Double] = Array.ofDim[Double](n.value)
  def +(other: Vec[N]) = // Must have the same size
    val result = Vec[N]()
    for i <- 0 until xs.length do 
      result.xs(i) = xs(i) + other.xs(i)
    result
  
  def ++[M <: Int](other: Vec[M])(using ValueOf[N + M]) =
    val result = Vec[N + M]()
    for i <- 0 until xs.length do
      result.xs(i) = xs(i)
    for i <- 0 until other.xs.length do
      result.xs(i + xs.length) = other.xs(i)
    result

  def middle(using N % 2 != 0 =:= true) = xs(n.value / 2)
  def update(n: Int, x: Double) =
    if 0 <= n && n < xs.length then xs(n) = x
  def apply(n: Int) = xs(n)
  override def toString = java.util.Arrays.toString(xs)

import scala.compiletime.*

// Can only add vectors of the same length

val v = Vec[4]  
val w = Vec[3]
v(0) = 0
v(1) = 1
v(2) = 2
v(3) = 3

w(0) = 1
w(1) = 2
w(2) = 3

// Vectors of the same size can be added
val sum = v + v
// v + w // Error

// This concatenation has 7 elements
v ++ w

// Vectors of odd length have a middle element
w.middle
// v.middle // Error
