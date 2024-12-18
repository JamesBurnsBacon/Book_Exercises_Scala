package section9

open class Person :
  var name = ""
  override def toString = getClass.getName + "[name=" + name + "]"
