import scala.collection.mutable
val numbers = Set(1, 2, 7) // immutable
numbers.getClass
val luckyNumbers = mutable.Set(13, 42) // mutable

numbers + 9

def digits(n: Int): Set[Int] =
  if n < 0 then digits(-n)
  else if n < 10 then Set(n)
  else digits(n / 10) + (n % 10)

digits(602214076)
