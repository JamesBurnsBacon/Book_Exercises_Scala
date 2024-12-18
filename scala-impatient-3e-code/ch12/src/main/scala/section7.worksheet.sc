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
