package scala$minusimpatient$minus3e$minuscode.ch18.src.main.scala


final class section6_1$u002Eworksheet$_ {
def args = section6_1$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch18/src/main/scala/section6_1.worksheet.sc"""
/*<script>*/
val v = 1
val w = 1
val x: v.type = v // Ok
/*
val y: v.type = w // Error
val z: v.type = 1 // Error
*/

// Caution: Singleton types aren't actually singletons--they also admit null
val v = "Hello"
val x: v.type = null // Ok
val v: "Hello" = null // Ok

class Document :
  def setTitle(title: String) = { /* ... */; this }
  def setAuthor(author: String) = { /* ... */; this }
  // ...

// This call is ok
val article = Document()
article.setTitle("Whatever Floats Your Boat").setAuthor("Cay Horstmann")

// But now consider the subclass
class Book extends Document :
  def addChapter(chapter: String) = { /* ... */; this }
  // ...

// This call will fail:
/*
val book = Book()
book.setTitle("Scala for the Impatient").addChapter("Advanced Types") // Error
*/

// Remedy: Change the return type of Document.setTitle
// def setTitle(title: String): this.type = { /* ... */; this }

/*</script>*/ /*<generated>*//*</generated>*/
}

object section6_1$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section6_1$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section6_1$u002Eworksheet_sc.script as `section6_1.worksheet`

