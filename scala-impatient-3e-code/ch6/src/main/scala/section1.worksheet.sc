object Accounts :
  private var lastNumber = 0
  def newUniqueNumber() =
    lastNumber += 1
    lastNumber

Accounts.newUniqueNumber()
Accounts.newUniqueNumber()

//no constructor parameters for objects, replaces singleton objects from other langs
//use for utility functions or constants, when a single immutable instance can be
//shared efficiently, when a single instance is required to coordinate a service
//singleton design patterns are unpopular bc can be used in bad designs

