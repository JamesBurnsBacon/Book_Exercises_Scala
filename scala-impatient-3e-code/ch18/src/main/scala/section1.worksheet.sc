// A union type
def isValid(choice: String, choices: String | Array[String]) =
  choices match
    case str: String => str.split("\\s+").contains(choice)
    case Array(elems*) => elems.contains(choice)

// Call the function with a string or an array
isValid("Bravo", "Alpha Bravo Charlie Delta")
isValid("Baker", Array("Alpha", "Bravo", "Charlie", "Delta"))

// Compare with
enum Choices :
  case StringChoices(str: String)
  case ArrayChoices(elems: String*)

def isValid(choice: String, choices: Choices) =
  choices match
    case Choices.StringChoices(str) => str.split("\\s+").contains(choice)
    case Choices.ArrayChoices(elems*) => elems.contains(choice)

isValid("Bravo", Choices.StringChoices("Alpha Bravo Charlie Delta"))

// Specify union return types explicitly

def inverse(x: Double): Double | String = if x == 0 then "Divide by zero" else 1 / x
inverse(2)
inverse(0)
