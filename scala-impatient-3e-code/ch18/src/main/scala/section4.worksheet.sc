type Appendable = { def append(str: String): Any }

def appendLines(target: Appendable, lines: Iterable[String]) =
  import reflect.Selectable.reflectiveSelectable
  for l <- lines do
    target.append(l); // Ok
    target.append("\n") // Ok

val sb = StringBuilder()
appendLines(sb, "Mary had a little lamb".split(" "))    
sb

val appender: Appendable = new :
  def append(str: String): Any = println(str)

appendLines(appender, "Mary had a little lamb".split(" "))
