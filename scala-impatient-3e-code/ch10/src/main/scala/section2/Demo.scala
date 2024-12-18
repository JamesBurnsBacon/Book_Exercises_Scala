package section2

import java.io.*

// Traits as interfaces

trait Logger :
  def log(msg: String) : Unit // An abstract method

class ConsoleLogger extends Logger : // Use extends, not implements
  def log(msg: String) = println(msg) // No override needed

class FileLogger extends Logger, AutoCloseable, Appendable :
  private val out = PrintWriter("/tmp/log.txt")
  def close() = { log("Closing"); out.close() }
  def log(msg: String) = append(msg + "\n")
  export out.append

@main def demo =
  val logger = ConsoleLogger()
  val logger2 = FileLogger()
  logger2.log("Running demo")
  logger2.close()
  logger.log("Exiting demo")
