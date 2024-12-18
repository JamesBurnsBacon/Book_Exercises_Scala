val numPattern = "[0-9]+".r
val wsnumwsPattern = """\s+[0-9]+\s+""".r
  // A bit easier to read than "\\s+[0-9]+\\s+".r

var input = "1728"
if numPattern.matches(input) then
  val n = input.toInt
  println(n + 1)

input = "Hello 1729!"
if numPattern.unanchored.matches(input) then
  println("There is a number here somewhere")

input = "99 bottles, 98 bottles"
numPattern.findAllIn(input).toArray // Yields Array(99, 98)

for m <- numPattern.findAllMatchIn(input) do
  println(s"${m.start} ${m.end}")

val firstMatch = wsnumwsPattern.findFirstIn("99 bottles, 98 bottles") 
  // Some(" 98 ")

numPattern.replaceFirstIn("99 bottles, 98 bottles", "XX")
  // "XX bottles, 98 bottles"
numPattern.replaceAllIn("99 bottles, 98 bottles", "XX")
  // "XX bottles, XX bottles"
numPattern.replaceSomeIn("99 bottles, 98 bottles",
  m => if m.matched.toInt % 2 == 0 then Some("XX") else None)
  // "99 bottles, XX bottles"

val varPattern = """\$[0-9]+""".r
def format(message: String, vars: String*) =
  varPattern.replaceSomeIn(message, m => vars.lift(
    m.matched.tail.toInt))
format("At $1, there was $2 on $0.",
  "planet 7", "12:30 pm", "a disturbance of the force")
  // At 12:30 pm, there was a disturbance of the force on planet 7.
