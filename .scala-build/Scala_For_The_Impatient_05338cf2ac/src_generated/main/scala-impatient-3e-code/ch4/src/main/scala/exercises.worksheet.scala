package scala$minusimpatient$minus3e$minuscode.ch4.src.main.scala


final class exercises$u002Eworksheet$_ {
def args = exercises$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch4/src/main/scala/exercises.worksheet.sc"""
/*<script>*/
// 1 Map of prices for a number of gizmos. Then a second map with same keys but
// prices at a ten percent discount
val fullPrices = Map("pen" -> 1.00, "book" -> 10.00, "GPU" -> 1000.00)
for (k,v) <- fullPrices yield (k,v*.9)

// 2 Read words from a file using java.util.Scanner
// use a mutable map to count the frequency of words.
// at the end, print out the words and their counts
//import java.util.*
import scala.collection.mutable

val wordCounts = mutable.Map[String, Int]().withDefaultValue(0)

val in = new java.util.Scanner(new java.io.File("scala-impatient-3e-code/ch4/src/main/scala/myfile.txt"))

while in.hasNext() do
    val word = in.next().toLowerCase().replaceAll("[^a-zA-Z0-9]","") //normalize words
    if word.nonEmpty then wordCounts(word) += 1

in.close()
for ((w, c) <- wordCounts) do println(s"$w: $c")

// 3 Repeat the preceding exercise with an immutable map,
// choosing to switch to a scala source scanner- why use java so much?
import scala.io.Source
import scala.collection.immutable.*
val source3 = Source.fromFile("scala-impatient-3e-code/ch4/src/main/scala/myfile.txt")

val wordCounts3: Map[String, Int] = source3.getLines().toList
    .flatMap(_.split("\\W+")) //lines into words
    .map(_.toLowerCase())
    .filter(_.nonEmpty)
    .foldLeft(Map.empty[String, Int]) { (c,w) =>
        c + (w -> (c.getOrElse(w, 0) + 1) )
    }

source3.close()

for ((w, c) <- wordCounts3) do println(s"$w: $c")

// 4 Repeat the preceding exercise with a sorted map, printing the words in sort order
// completing sorting at print request
val source4 = Source.fromFile("scala-impatient-3e-code/ch4/src/main/scala/myfile.txt")

val wordCounts4: Map[String, Int] = source4.getLines().toSeq
    .sortWith(( s, t) => s.charAt(0) < t.charAt(0))
    .flatMap(_.split("\\W+")) //lines into words
    .map(_.toLowerCase())
    .filter(_.nonEmpty)
    .foldLeft(Map.empty[String, Int]) { (c,w) =>
        c + (w -> (c.getOrElse(w, 0) + 1) )     
    }

source4.close()

wordCounts4.toSeq.sortBy(_._1).foreach {
    case (w, c) => println(s"$w: $c")
}

// 5 Repeat the preceding exercise with a TreeMap
// a treemap is a sorted map, when traversal in ordering is desired.
// immutable.HashMap has better performance when key-value otder traversal doesn't matter
// if you need insertion order, use immutable.SeqMap

val source5 = Source.fromFile("scala-impatient-3e-code/ch4/src/main/scala/myfile.txt")

val wordCounts5: TreeMap[String, Int] = source5.getLines().toSeq
    .flatMap(_.split("\\W+")) //lines into words
    .map(_.toLowerCase())
    .filter(_.nonEmpty)
    .foldLeft(TreeMap.empty[String, Int]) { (c,w) =>
        c + (w -> (c.getOrElse(w, 0) + 1) )     
    }

source5.close()

for ((w, c) <- wordCounts5) do println(s"$w: $c")
// 6 Define a linked hash map that maps "Monday" to java.util.calendar.MONDAY,
// and similarly for the other weekdays. Demonstrate elements visited in insertion order
import scala.collection.mutable.LinkedHashMap
import java.util.Calendar

val weekdayMap = LinkedHashMap(
    "Monday" -> Calendar.MONDAY,
    "Tuesday" -> Calendar.TUESDAY,
    "Wednesday" -> Calendar.WEDNESDAY,
    "Thursday" -> Calendar.THURSDAY,
    "Friday" -> Calendar.FRIDAY,
    "Saturday" -> Calendar.SATURDAY,
    "Sunday" -> Calendar.SUNDAY
)

for ((k,v) <- weekdayMap) do println(s"$k: $v")

// 7 Print a table of all Java properties reported by the getProperties method of the
// java.lang.System class. Find length of longest key before printing table.
import java.lang.System
import scala.collection.JavaConverters.*

val props = System.getProperties.asScala

val longestKeyLen = props.keys.map(_.length).max

println(s"Longest Key Length: $longestKeyLen")
for ((k,v) <- props) do println(s"$k: $v")

// 8 Write a function minmax(values: Array[Int]) that returns a pair containing the smallest
// and the largest values in the nonempty array
def minmax(values: Array[Int]) = (values.min, values.max)

minmax(Array(1,3,5,9))
// 9 Reimplement the function from preceding ex to return an Option that is None if
// the array happens to be empty
def minmax9(values: Array[Int]) =
    if values.length != 0 then
        (values.min, values.max)
    else
        val OpNone: Option[Int] = None

minmax9(Array())
minmax9(Array(1,3,5,9))

// 10 Prompt the user for a first and last letter, then prints a matching word from
// scala.io.Source.fromFile("/usr/share/dict/words").mkString.split("\n")
// use find. What alternatives do you have for dealing with the returned option?
import scala.io.StdIn.*

val firstLetter = readLine("Enter first letter: ").toLowerCase
val lastLetter = readLine("Enter last letter: ").toLowerCase

val words = 
    scala.io.Source.fromFile("scala-impatient-3e-code/ch4/src/main/scala/myfile.txt").mkString.split("\n")

val matchingWord = words.find(word =>
    word.nonEmpty &&
    word.head.toLower == firstLetter.charAt(0) &&
    word.last.toLower == lastLetter.charAt(0)
)

matchingWord match {
    case Some(word) => println(s"Matching word: $word")
    case None => println("No matching words found.") 
}

// 11 Demonstrate the argument of getOrElse method in the Option class is eval'd lazily
val someVal: Option[Any] = Some(9)
val noneVal: Option[Any] = None

println(someVal.getOrElse(throw new RuntimeException("Lazily Evaluated!")))
//println(noneVal.getOrElse(throw new RuntimeException("Lazily Evaluated!"))) //throws error

// 12 function lteqgt(values: Array[Int], v: Int) that returns a triple with counts
// of values less than v, equal to v, and greater than v.
def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) =
    var lessThans = 0
    var equalTos = 0
    var greaterThans = 0
    for (value <- values) do
        if (value < v) then lessThans += 1
        else if (value == v) then equalTos += 1
        else greaterThans += 1  
    (lessThans, equalTos, greaterThans) 

lteqgt(Array(1,2,3,4,5), 3)                   

// 13 What happens when you zip together two strings? Come up with a use case
// use case: making cute txt diminutives e.g. "happy birthday" becomes "happyy birthdayy"

//you get an array of tuples with strings inside
val basicBirthdayWish = Array("Happy", " Birthday")
val cuteTextDiminutive = Array("y", "y")

val cuteBirthdayDiminutive = basicBirthdayWish.zip(cuteTextDiminutive).mkString
println(cuteBirthdayDiminutive)
/*</script>*/ /*<generated>*//*</generated>*/
}

object exercises$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new exercises$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export exercises$u002Eworksheet_sc.script as `exercises.worksheet`

