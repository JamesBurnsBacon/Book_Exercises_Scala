import scala.compiletime.*
import scala.quoted.*

object Debug:
  inline def debug1[T](inline arg: T): Unit = ${debug1Impl('arg)}
  
  private def debug1Impl[T : Type](arg: Expr[T])(using Quotes): Expr[Unit] =
    '{println(${Expr(arg.show)} + ": " + ${Expr(Type.show[T])} + " = " + $arg)}

  inline def debugN(inline args: Any*): Unit = ${debugNImpl('args)}
  
  private def debugNImpl(args: Expr[Seq[Any]])(using q: Quotes): Expr[Unit] =
    import q.reflect.*
  
    val exprs: Seq[Expr[String]] = args match
      case Varargs(es) =>
        es.map { e =>
          e.asTerm match
            case Literal(c: Constant) => Expr(c.value.toString)
            case _ => '{${Expr(e.show)} + " = " + $e}
        }
  
    '{println(${exprs.reduce((e1, e2) => '{$e1 + ", " + $e2})})}

opaque type StringMatching[R <: String & Singleton] = String

object StringMatching :
  inline given string2StringMatching[S <: String & Singleton, R <: String & Singleton]:
      Conversion[S, StringMatching[R]] = str =>
    inline val regex = constValue[R]
    inline if matches(str, regex)
    then str.asInstanceOf[StringMatching[R]]
    else error(str + " does not match " + regex)

  inline def matches(inline str: String, inline regex: String): Boolean =
    ${matchesImpl('str, 'regex)}
  
  def matchesImpl(str: Expr[String], regex: Expr[String])(using Quotes): Expr[Boolean] =
    Expr(str.valueOrAbort.matches(regex.valueOrAbort))
