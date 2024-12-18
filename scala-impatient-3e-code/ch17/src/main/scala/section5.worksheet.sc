// The ClassTag context bound

import scala.reflect.*
def makePair[T : ClassTag](first: T, second: T) = 
  Array[T](first, second)

makePair(4, 9)
