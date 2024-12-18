val strings = Array("Hello", "World") 
  // An Array[String] of length 2—the type is inferred
val moreStrings = Array.ofDim[String](5)
  // A string array with five elements, all initialized with null
val nums = Array.ofDim[Int](10)
  // An array of ten integers, all initialized with zero

// Use () to access elements
strings(0) = "Goodbye"
  // strings is now Array("Goodbye", "World")
strings
strings
