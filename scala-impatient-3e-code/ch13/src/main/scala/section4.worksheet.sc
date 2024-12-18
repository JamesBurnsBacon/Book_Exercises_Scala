val digits = List(4, 2)

// Head and tail

digits.head
digits.tail
digits.tail.head
digits.tail.tail

// The :: operator

9 :: List(4, 2)
9 :: 4 :: 2 :: Nil
9 :: (4 :: (2 :: Nil))

val fibs = List(1, 1, 2, 3, 5, 8, 13, 21, 34, 55)

// With if/else
{
  def sum(lst: List[Int]): Int =
    if lst == Nil then 0 else lst.head + sum(lst.tail)

  sum(fibs)
}

// With pattern matching
{
  def sum(lst: List[Int]): Int = lst match
    case Nil => 0
    case h :: t => h + sum(t) // h is lst.head, t is lst.tail

  sum(fibs)
}

// You don't actually need recursion for computing the sum
List(9, 4, 2).sum // Yields 15
