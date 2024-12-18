// print is like println, but doesn't add a newline: 
print("Answer: ")
println(42)

// You can use string concatenation for complex outputs:
println("Answer: " + 42)

// For formatted output, use the f interpolator: 
val name = "Fred"
val age = 42
println(f"Hello, $name! In six months, you'll be ${age + 0.5}%7.2f years old.")

// The raw interpolator:
raw"\n is a newline"

// Double an actual dollar in an interpolated string: 
val price = 19.95
f"$$$price: a 50%% discount"
