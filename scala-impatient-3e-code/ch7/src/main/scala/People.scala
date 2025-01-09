// Section 7.1
// This file contributes to multiple packages
package com :
  package horstmann :
    package people :
      class Person(val name: String) :
        def description = s"A person with name $name"

    package users :
      class User(val username: String, password: String) :
        def description = s"A user with name $username"
        // Section 7.6 
        // Can restrict visibility to specific package
        private[users] def longDescription = s"A user with name $username and password $password"
        private[horstmann] def safeDescription = s"A user with name $username and password ${"*" * password.length}"

        //longDescription is only available in package users