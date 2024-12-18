// A better switch

for (c <- "+-!") yield
  val ch: Char = c
  var sign = 0
  ch match
    case '+' => sign = 1
    case '-' => sign = -1
    case _ => sign = 0
  sign

// match is an expression

for (ch <- "+-!") yield
  val sign = ch match
    case '+' => 1
    case '-' => -1
    case _ => 0
  sign

// Separate cases with |

for (prefix <- Array("0x", "0X", "0", "")) yield
  prefix match
    case "0x" | "0X"  => 16
    case "0" => 8
    case _ => 10

// Works with any types

import java.awt.*
for (color <- Array(Color.RED, Color.GREEN, Color.BLUE, Color.BLACK)) yield
  color match
    case Color.RED => 0xff0000
    case Color.GREEN => 0xff00
    case Color.BLUE => 0xff
