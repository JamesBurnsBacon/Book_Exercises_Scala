package scala$minusimpatient$minus3e$minuscode.ch17.src.main.scala


final class section12$u002Eworksheet$_ {
def args = section12$u002Eworksheet_sc.args$
def scriptPath = """scala-impatient-3e-code/ch17/src/main/scala/section12.worksheet.sc"""
/*<script>*/
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

/*</script>*/ /*<generated>*//*</generated>*/
}

object section12$u002Eworksheet_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }

  lazy val script = new section12$u002Eworksheet$_

  def main(args: Array[String]): Unit = {
    args$set(args)
    val _ = script.hashCode() // hashCode to clear scalac warning about pure expression in statement position
  }
}

export section12$u002Eworksheet_sc.script as `section12.worksheet`

