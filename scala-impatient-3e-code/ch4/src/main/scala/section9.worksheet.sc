val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)
val pairs = symbols.zip(counts)
for ((s, n) <- pairs) print(s * n) // Prints <<---------->>
val keys = Array("Alice", "Bob", "Cindy")
val values = Array(10, 3, 7)
keys.zip(values).toMap
