// Section 7.4
// Top-of-file notation
package com.horstmann.collection // No colon

class Group :
  
  // Section 7.8
  // Imports restricted to this class
  import scala.collection.mutable.*
  import com.horstmann.users.*
  val members = ArrayBuffer[User]()

  //when all code in the file belongs to the same package, use top of file notation
  //keep all top-level definitions of a package in a single file with a fixed name