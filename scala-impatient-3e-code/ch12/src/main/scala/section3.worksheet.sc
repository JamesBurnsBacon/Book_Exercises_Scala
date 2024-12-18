// Parameters that are functions

import scala.math.*
def valueAtOneQuarter(f: (Double) => Double) = f(0.25)
valueAtOneQuarter(ceil) // 1.0
valueAtOneQuarter(sqrt) // 0.5 (because 0.5 × 0.5 = 0.25)
def mulBy(factor : Double) = (x : Double) => factor * x
val quintuple = mulBy(5)
quintuple(20) // 100
