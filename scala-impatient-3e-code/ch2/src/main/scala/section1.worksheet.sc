// In Scala, "if" is an expression with a value:
val x = -1
if x > 0 then 1 else -1

// You can assign the value to a variable:
val s = if x > 0 then 1 else -1

// That is nicer than making an assignment in each branch: 
var t = 0
if x > 0 then t = 1 else t = -1

// With branches of different types, the result has the common supertype
if x > 0 then "positive" else -1

// If the "else" branch is missing, it has type Unit:
if x > 0 then "positive"

// To see the Unit result, we print it:
println(if x > 0 then "positive")

// A missing "else" is no problem with a "then" branch of type Unit:
if x < 0 then println("negative")
