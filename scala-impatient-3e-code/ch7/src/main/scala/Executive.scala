package com :   
  package horstmann.people :
    // Members of com.horstmann are not visible here
    class Executive :
      val subordinates = collection.mutable.ArrayBuffer[Manager]()

// you can chain package clauses to limit visible members