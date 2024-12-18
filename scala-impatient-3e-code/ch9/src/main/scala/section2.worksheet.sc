import scala.io.*

var source = Source.fromFile("myfile.txt", "UTF-8")
var upper = 0
def process(c: Char) = if c.isUpper then upper += 1
for c <- source do process(c)
upper


def isNice(c: Char) = c.isUpper
def process(i: BufferedIterator[Char]) = 
  var result = ""
  while i.hasNext && !i.head.isWhitespace do
    result += i.next
  println(result)

source = Source.fromFile("myfile.txt", "UTF-8")
val iter = source.buffered
while iter.hasNext do
  if isNice(iter.head) then
    process(iter)
  else
    iter.next
source.close()
