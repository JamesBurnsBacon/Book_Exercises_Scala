package com :
  package horstmann :
    package people : 
      class Employee(name: String, var salary: Double) :
        def description = s"An employee with name $name"
        def giveRaise(rate: Double) = 
          salary += Math.percentOf(salary, rate)
    object Math :
      def percentOf(value: Double, rate: Double) = value * rate / 100
