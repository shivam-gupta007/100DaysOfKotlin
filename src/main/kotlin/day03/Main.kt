package day03

//Kotlin Extension functions

/*
* When a function is added to existing class. it is known as Extension function.
* Extension functions resolves statically i.e. which means extension function is executed depends on totally
* on the type of the expression on which it is invoked, rather than on the type resolved on the final execution
* of the expression at runtime.
*
* */

class MyClass {
    var name: String = ""
    fun greet(name: String) {
        this.name = name
        println("Good Morning ${this.name}")
    }
}

//Extension function for 'MyClass'
fun MyClass.hello() {
    println("Hello $name")
}

//Extension function for library classes
fun Int.sqrt(): Int {
    return this * this
}

fun main() {
    val obj = MyClass()
    obj.greet(name = "Bob")
    obj.hello()
    println((8).sqrt())
}