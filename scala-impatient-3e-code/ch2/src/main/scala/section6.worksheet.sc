// Multiple generators:
for
  i <- 1 to 3
  j <- 1 to 3
do
  print(f"${10 * i + j}%3d")
  // Prints 11 12 13 21 22 23 31 32 33

// A guard:
for
  i <- 1 to 3
  j <- 1 to 3
  if i != j
do
  print(f"${10 * i + j}%3d")
  // Prints 12 13 21 23 31 32

// Defining an additional variable:
for
  i <- 1 to 3
  from = 4 - i
  j <- from to 3
do
  print(f"${10 * i + j}%3d")
  // Prints 13 22 23 31 32 33

// Use semicolons if you write the loop in a single line:
for i <- 1 to 3; from = 4 - i; j <- from to 3 if i != j do println(i * 10 + j)

// The classic syntax uses parentheses instead of "do":
for (i <- 1 to 3; from = 4 - i; j <- from to 3 if i != j) println(i * 10 + j)

// Braces are ok too:
for { i <- 1 to 3; from = 4 - i; j <- from to 3 if i != j } println(i * 10 + j)

// A collection of yielded values is the loop's value:
val result = for i <- 1 to 10 yield i % 3
  // Yields Vector(1, 2, 0, 1, 2, 0, 1, 2, 0, 1)

// The collection type is compatible with the generator:
for c <- "Hello" yield (c + 1).toChar
  // Yields the string "Ifmmp"
