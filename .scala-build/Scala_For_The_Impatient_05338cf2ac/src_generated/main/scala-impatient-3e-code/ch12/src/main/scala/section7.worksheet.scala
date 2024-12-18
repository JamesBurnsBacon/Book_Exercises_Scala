package scala$minusimpatient$minus3e$minuscode.ch12.src.main.scala


final class section7$u002Eworksheet$_ {
def args = section7$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch12/src/main/scala/section7.worksheet.sc"""
/*<script>*/
// Interoperability with lambda expressions

import java.awt.event.*
import javax.swing.*

var counter = 0

val button = JButton("Increment")
button.addActionListener(event => counter += 1)

/*
// This does not work:
val listener = (event: ActionEvent) => println(counter)
button.addActionListener(listener)
  // Cannot convert a nonliteral function to a Java functional interface
*/

// Remedy #1:
val listener: ActionListener = event => println(counter)
button.addActionListener(listener) // Ok

// Remedy #2:
val exit = (event: ActionEvent) => if counter > 9 then System.exit(0)
button.addActionListener(exit(_))

val frame = new JFrame
frame.add(button)
frame.pack()
frame.setVisible(true)

/*</script>*/ /*<generated>*//*</generated>*/
}

object section7$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section7$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section7$u002Eworksheet_sc.script as `section7.worksheet`

