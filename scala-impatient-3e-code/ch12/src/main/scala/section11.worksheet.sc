package section11

// Nonlocal returns

def until(condition: => Boolean)(block: => Unit): Unit =
  if !condition then
    block
    until(condition)(block)

def indexOf(str: String, ch: Char): Int = 
  var i = 0
  until (i == str.length) { 
    if str(i) == ch then return i
    i += 1
  }
  -1

indexOf("Hello", 'l')
