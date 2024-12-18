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
