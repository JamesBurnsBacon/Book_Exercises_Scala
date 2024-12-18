package section11

// Dynamic invocation

import scala.language.dynamics

class DynamicProps(val props: java.util.Properties) extends Dynamic :
  def updateDynamic(name: String)(value: String) =
    props.setProperty(name.replaceAll("_", "."), value)  
  def selectDynamic(name: String) =
    props.getProperty(name.replaceAll("_", "."))
  def applyDynamicNamed(name: String)(args: (String, String)*) =
    if name != "add" then throw IllegalArgumentException()
    for ((k, v) <- args)
      props.setProperty(k.replaceAll("_", "."), v)

@main def demo =
  val sysProps = DynamicProps(System.getProperties)
  sysProps.username = "Fred" // Sets the "username" property to "Fred"
  val home = sysProps.java_home // Gets the "java.home" property
  sysProps.add(username="Fred", password="Secret")
  println(sysProps.props)
