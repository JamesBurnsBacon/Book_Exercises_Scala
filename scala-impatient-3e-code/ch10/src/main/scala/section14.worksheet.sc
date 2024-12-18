// A transparent trait is not used for type inference
// Note that Serializable is not inferred for p

class Person
class Employee extends Person, Serializable, Cloneable
class Contractor extends Person, Serializable, Cloneable
val p = if scala.math.random() < 0.5 then Employee() else Contractor()
p

// Here is how to declare your own transparent trait

transparent trait Logged

class Event
class ActionEvent extends Logged
class ChangeEvent extends Logged

// Note that Logged is not inferred for e
val e = if Math.random() < 0.5 then ActionEvent else ChangeEvent
e
