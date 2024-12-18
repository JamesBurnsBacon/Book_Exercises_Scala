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
