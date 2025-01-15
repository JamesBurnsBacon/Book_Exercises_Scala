import employee.scala

//package scope nesting
package com.horstmann.impatient :
    class C {}

//package scope full
package com :
    class A {}
package horstmann:
    class B {}
package impatient:
    class C {}

//The scope of the nested package only includes the final "impatient" package content, while the non nested package calls include the entirety of content from com, horstmann, and impatient.