// A val field is a read-only property
class Message : 
  val timeStamp = java.time.Instant.now
  var text = "Hello, World!"

@main def messageDemo =
  val msg = Message()
  println(s"${msg.timeStamp} ${msg.text}")
  // Cannot change msg.timeStamp
