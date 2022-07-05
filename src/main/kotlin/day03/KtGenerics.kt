package day03

//Kotlin Generics

//Generic Class
class MyClass1<T>(value: T) {
    var myValue = value
}

fun main() {
    val obj1: MyClass1<String> = MyClass1(value = "Hey, Devs")
//    println(obj1.myValue)

    val obj2: MyClass1<Int> = MyClass1(value = 100)
//    println(obj2.myValue)

   // println(obj2.myValue::class.java.typeName == "java.lang.Integer")


    when (getValue(false)::class.java.typeName) {
        "java.lang.Integer" -> {
            val obj3: MyClass1<Int> = MyClass1(value = 500)
             println(obj3.myValue)
        }
        "java.lang.String" -> {
            val obj4: MyClass1<String> = MyClass1(value = "Hey, Android devs")
             println(obj4.myValue)
        }
    }
}

fun getValue(flag: Boolean): Any {
    return if (flag) 100 else "100"
}