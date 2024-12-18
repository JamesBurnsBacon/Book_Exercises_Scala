// Adding an element twice has no effect
Set(2, 0, 1) + 1

// Hash sets have seemingly random iteration order
Set(1, 2, 3, 4, 5, 6)

// Linked hash sets retain the insertion order
val weekdays = scala.collection.mutable.LinkedHashSet("Mo", "Tu", "We", "Th", "Fr")

// Sorted sets are traversed in sorted order
val numbers = scala.collection.mutable.SortedSet(1, 2, 3, 4, 5, 6)

// Set operations
val digits = Set(1, 7, 2, 9)
digits.contains(0) // false
Set(1, 2).subsetOf(digits) // true
val primes = Set(2, 3, 5, 7)
digits.union(primes)
digits & primes
digits -- primes
