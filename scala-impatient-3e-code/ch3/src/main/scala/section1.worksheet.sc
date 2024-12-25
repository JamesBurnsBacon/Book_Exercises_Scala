val strings = Array("Hello", "World") 
  // An Array[String] of length 2—the type is inferred
val moreStrings = Array.ofDim[String](5)
  // A string array with five elements, all initialized with null
val nums = Array.ofDim[Int](10)
  // An array of ten integers, all initialized with zero


strings
// Use () to access elements
strings(0) = "Goodbye"
  // strings is now Array("Goodbye", "World")
strings


// Array if len is fixed, ArrayBuffer if len varies
// () to access elements
// to traverse, use                for elem <-arr do
// to transform into new array     for elem <-arr yield
// sc and java arrays are interoperable, for ArrayBuffer, ues scala.jdk.CollectionConverters

