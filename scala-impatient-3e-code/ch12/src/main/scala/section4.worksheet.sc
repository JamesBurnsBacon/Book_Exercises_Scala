// Parameter inference

def valueAtOneQuarter(f: (Double) => Double) = f(0.25)
valueAtOneQuarter((x: Double) => 3 * x) // 0.75
valueAtOneQuarter((x) => 3 * x)
valueAtOneQuarter(x => 3 * x)
valueAtOneQuarter(3 * _)
/*
// The following does not work:
val fun = 3 * _ // Error: Can’t infer types
*/
// Remedy:
3 * (_: Double) // OK
val fun: (Double) => Double = 3 * _ // OK because we specified the type for fun
// Turning methods into functions:
(_: String).length
(_: String).substring(_:Int, _: Int)
