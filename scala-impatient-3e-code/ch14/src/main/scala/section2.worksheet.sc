// Guards

var number = 0
var sign = 1
for (ch <- "-123") 
  ch match
    case _ if Character.isDigit(ch) => number = 10 * number + Character.digit(ch, 10)
    case '+' => sign = 1
    case '-' => sign = -1
sign * number
