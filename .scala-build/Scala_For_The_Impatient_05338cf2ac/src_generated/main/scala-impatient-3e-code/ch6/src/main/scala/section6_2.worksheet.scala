package scala$minusimpatient$minus3e$minuscode.ch6.src.main.scala


final class section6_2$u002Eworksheet$_ {
def args = section6_2$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch6/src/main/scala/section6_2.worksheet.sc"""
/*<script>*/
{
  enum TrafficLightColor :
    case Red, Yellow, Green
    def next = TrafficLightColor.fromOrdinal((ordinal + 2) % 3)

  object TrafficLightColor :
    def random() = TrafficLightColor.fromOrdinal(scala.util.Random.nextInt(3))
  (TrafficLightColor.Red.next, TrafficLightColor.Red.next.next, TrafficLightColor.random())
}

{
  enum TrafficLightColor(val description: String) :
    case Red extends TrafficLightColor("Stop")
    case Yellow extends TrafficLightColor("Hurry up")
    case Green extends TrafficLightColor("Go")
  TrafficLightColor.Yellow.description
}

{
  enum TrafficLightColor :
    case Red, Yellow, Green
     @deprecated("""https://99percentinvisible.org/article/stop-at-red-go-on-grue-\
  how-language-turned-traffic-lights-bleen-in-japan/""") case Blue
  TrafficLightColor.Blue
}

/*</script>*/ /*<generated>*//*</generated>*/
}

object section6_2$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section6_2$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section6_2$u002Eworksheet_sc.script as `section6_2.worksheet`

