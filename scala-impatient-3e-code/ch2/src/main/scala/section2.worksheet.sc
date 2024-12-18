// Use a semicolon to separate two statements on the same line:
var n = 10
var r = 1
if n > 0 then { r = r * n; n -= 1 }

// Break a long line so that the parser can see that it is incomplete:
var s = 0.0
var v = 10.0
var a = 0.2
var t = 0.01
s = s + v * t + // The + tells the parser that this is not the end 
  0.5 * a * t * t
