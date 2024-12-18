// Section 7.1
// Multiple files contribute to the com.horstmann.people package
package com :
  package horstmann :
    package people : 
      class Manager(name: String) :
        val subordinates = _root_.scala.collection.mutable.ArrayBuffer[Employee]()
        // Section 7.2
        // The following would not work because collection is also in the scope
        // val subordinates = collection.mutable.ArrayBuffer[Employee]()
        def description = s"A manager with name $name"
