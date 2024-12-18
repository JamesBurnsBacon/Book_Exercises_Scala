package scala$minusimpatient$minus3e$minuscode.ch6.src.main.scala


final class section6_1$u002Eworksheet$_ {
def args = section6_1$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch6/src/main/scala/section6_1.worksheet.sc"""
/*<script>*/
enum TrafficLightColor :
  case Red, Yellow, Green
TrafficLightColor.Yellow.ordinal // Yields 1
TrafficLightColor.fromOrdinal(1) // Yields TrafficLightColor.Yellow
TrafficLightColor.values // Yields Array(Red, Yellow, Green)
TrafficLightColor.valueOf("Yellow")
TrafficLightColor.Yellow.toString // Yields "Yellow"

/*</script>*/ /*<generated>*//*</generated>*/
}

object section6_1$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section6_1$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section6_1$u002Eworksheet_sc.script as `section6_1.worksheet`

