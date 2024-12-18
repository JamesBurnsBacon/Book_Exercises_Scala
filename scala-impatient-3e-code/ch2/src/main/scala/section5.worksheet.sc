// The quiet syntax
var r = 1
var n = 10
while n > 0 do
  r = r * n
  n -= 1
r

// The noisy syntax
r = 1
n = 10
while (n > 0) {
  r = r * n
  n -= 1
}
r

// Consider adding an "end" statement to a long quiet loop:
r = 1
n = 10
while n > 0 do
  r = r * n
  // Many more lines
  n -= 1
end while

// If you must use a "do" loop, put all the work in the condition block:
var estimate = 1.0
var a = 2.0
var EPSILON=1E-12
while
  val previous = estimate // Work done in the block
  estimate = (estimate + a / estimate) / 2 // More work done
  scala.math.abs(estimate - previous) > EPSILON // This is the value of the block and the loop condition
do () // All work was done in the condition block
estimate

// A for loop:
r = 1
n = 10
for i <- 1 to n do 
  r = r * i
r

// Looping over index values:
val s = "Hello"
var sum = 0
for i <- 0 to s.length - 1 do
  sum += s(i)

// Or directly over the elements:
sum = 0
for ch <- "Hello" do sum += ch

// Give me a break:
import scala.util.control.Breaks.*
breakable {
   for c <- "Hello, World!" do
      if c == ',' then break // Exits the breakable block
      else println(c)    
}

// Loop variables shadow outer variables of the same name
val k = 42
for k <- 1 to 10 do
  println(k) // Here k refers to the loop variable
