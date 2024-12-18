// Polymorphic functions

// Consider this function

def firstLast[T](a: Array[T]) = (a(0), a(a.length - 1))

// Would like to rewrite it in the form

// val firstLast = (a: Array[T]) => 
// This won't work--there are no generic val

// val firstLast[T] = (a: Array[T]) => (a(0), a(a.length - 1)) // Error

// Here is how to do it:

val firstLast = [T] => (a: Array[T]) => (a(0), a(a.length - 1))

// Note the polymorphic function type [T] => Array[T] => (T, T)

// Useful for lambdas with varying types

val tuple = (1, 3.14, "Fred")
tuple.map([T] => (x: T) => Some(x))
