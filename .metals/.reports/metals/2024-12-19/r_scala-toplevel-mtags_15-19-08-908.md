error id: file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.sc:[253..254) in Input.VirtualFile("file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.sc", "// 1 prints the message on the first line, and empty parentheses on the second line
//It prints the parentheses as if literal
println(println("Hello"))

// 2 value and type of empty block expression {}, has only the absence of meaningful data
type {} //Unit
 
// 3  assignment where x = y = 1 is valid
var i: Any = 0
var j = 0

i = j = 1 // Does not set i to 1

// 4 Scala loop from Java syntax: for(int i = 10, i >= 0; i--)System.out.println(i);
i = 10
while i >= 0 do
  println(i)
  i -= 1
end while

")
file:///C:/Users/james/Documents/GitHub/Scala_For_The_Impatient/scala-impatient-3e-code/ch2/src/main/scala/Exercises.worksheet.sc:6: error: expected identifier; obtained lbrace
type {} //Unit
     ^
#### Short summary: 

expected identifier; obtained lbrace