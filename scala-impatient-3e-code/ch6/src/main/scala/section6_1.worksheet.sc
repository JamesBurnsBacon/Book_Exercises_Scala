enum TrafficLightColor :
  case Red, Yellow, Green
TrafficLightColor.Yellow.ordinal // Yields 1
TrafficLightColor.fromOrdinal(1) // Yields TrafficLightColor.Yellow
TrafficLightColor.values // Yields Array(Red, Yellow, Green)
TrafficLightColor.valueOf("Yellow")
TrafficLightColor.Yellow.toString // Yields "Yellow"
