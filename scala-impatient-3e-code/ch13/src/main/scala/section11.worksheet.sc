var count = 0
def process(s: String) = 
  println(s)
  count += 1
  return count == 500
val iter = "uncopyrightable".permutations // some Iterator
var done = false
while !done && iter.hasNext do
  done = process(iter.next())

val result = iter.take(500).toList
val result2 = iter.takeWhile(isNice).toList // isNice is some function returning Boolean.

val filename = "/etc/hosts"
val iter = scala.io.Source.fromFile(filename).buffered
while iter.hasNext && iter.head == '#' do
  while iter.hasNext && iter.head != '\n' do
    iter.next
// Now iter points to the first line not starting with #
iter.head
