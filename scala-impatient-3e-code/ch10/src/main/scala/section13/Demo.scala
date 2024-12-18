package section13

// Under the hood

trait Logger :
  def log(msg: String) : Unit

trait ConsoleLogger :
  def log(msg: String) = println(msg)

trait ShortLogger extends ConsoleLogger :
  val maxLength = 15 // A concrete field
  abstract override def log(msg: String) = 
    super.log(
      if msg.length <= maxLength then msg
      else s"${msg.substring(0, maxLength - 1)}…")

class Account :
  protected var balance = 0.0

class ShortLoggedAccount extends Account, ShortLogger

trait LoggedException extends Exception, ConsoleLogger :
  override def log(msg: String) = super.log(s"${getMessage()} $msg")

class UnhappyException extends LoggedException : 
  override def getMessage() = "arggh!"

def describeClass(cl: Class[?]) =
  val superCl = cl.getSuperclass
  val superInterfaces = cl.getInterfaces 
  if cl.isInterface then s"interface ${cl.getName}" 
    + (if superInterfaces.length == 0 then "" 
      else " extends " + superInterfaces.map(_.getName).mkString(", "))
  else s"class ${cl.getName}"
    + (if superCl == classOf[Object] then "" 
      else " extends " + superCl.getName)
    + (if superInterfaces.length == 0 then "" 
      else " implements " + superInterfaces.map(_.getName).mkString(", "))  

def printPublicMethods(cl: Class[?]) = 
  println(s"${describeClass(cl)} public methods")
  println(cl.getMethods.map(_.toString).mkString("\n"))

def printDeclaredFields(cl: Class[?]) =
  println(s"${describeClass(cl)} declared fields")  
  println(cl.getDeclaredFields.map(_.toString).mkString("\n"))

@main def demo = 
  printPublicMethods(classOf[Logger])
  printPublicMethods(classOf[ConsoleLogger])
  printPublicMethods(classOf[ShortLogger])
  printPublicMethods(classOf[ShortLoggedAccount])
  printDeclaredFields(classOf[ShortLoggedAccount])  
  printPublicMethods(classOf[LoggedException])
  printPublicMethods(classOf[UnhappyException])
