package day04

//Collections In Kotlin

/*
* There are two types of collections:
* 1. Mutable (List, Set, Map)
* 2. Immutable (
*
*
* */

fun main() {

    //List

    //creating the list using the 'listOf' method
    val myList1 = listOf(10, 40, 30, 20, 50)
    println(myList1)

    //creating the list using the List constructor
    val myList2 = List(size = 10, init = { i -> i + 1 })
    println(myList2)

    //Printing Even numbers from the list
    myList2.forEach {
        if (it % 2 == 0) print("$it ")
    }

    println()

    //Accessing the element of list using the index
    println(myList1[0])
    println(myList2[0])

    val mySubList1 = myList1.subList(fromIndex = 2, toIndex = 4)
    println(mySubList1)

    //Creating List from range
    val myList3 = (1..20).toList()
    println(myList3)

    val myList4 = ('a'..'g').toList()
    println(myList4)

    //Use 'take' in List
    println(myList3.take(7))
    println(myList3.takeWhile { it < 13 })
    println(myList3.takeLast(5))
    println(myList3.takeLastWhile { it > 18})


}