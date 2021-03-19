package hello

object Hello {
  // literal value (singleton) of type Unit is ()
  def main(args:Array[String]): Unit = {
    // subject verb object
    // infix invocation form
    Console.println("Hello Scala World!")
    Console println "Hello Scala World!"

    // NO function args are val, and cannot be reassigned
//    args = null
//    var x: Int = 99
//    var x = 99
    val x = 99
//    x = x + 10 // cannot reassign a val
//    x += 1
//    x++ // NOT in Scala
    println("The value is " + 99)
    println(s"The value is $x")
    println(s"The value is ${x + 100}")

    val p= 3.14
    println(f"The value of p is ${p}%7.3f")
  }
}

class Hello

