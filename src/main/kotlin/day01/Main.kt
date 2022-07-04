package day01

fun main(args: Array<String>) {

    // Pair in kotlin

    //Declaring Pair using Pair Constructor -
    val myPair = Pair(first = "Shivam", second = 22)

    //Accessing Pair value using 'first' and 'second' member variable -
    println(myPair.first)
    println(myPair.second)

    //Receiving Pair through function
    //We can get the Pair values with named variables like this-

    val (name, age) = getPersonInfo()
    println("Name: $name, Age: $age")

    //Converting a Pair into a List type
    val myPair1 = Pair("Hi", "Developers")

    val list: List<String> = myPair1.toList()
    println("List: $list")

    //****************************

    //Triple in kotlin

    //Declaring triple using Triple Constructor
    val myTriple = Triple(first = "Dhruv", second = 25, third = 10000.0F)

    //Accessing Triple value using 'first', 'second' and 'third' member variable -
    println(myTriple.first)
    println(myTriple.second)
    println(myTriple.third)

    //Receiving Triple through function
    //We can get the Triple values with named variables like this-

    val (empName, empAge, empSalary) = getEmployeeInfo()
    println("Employee Name: $empName")
    println("Employee Age: $empAge")
    println("Employee Salary: $empSalary")

    //Converting a Triple into a List type
    val myTriple1 = Triple("Hi", "Hello", "Bye")
    val list1: List<String> = myTriple1.toList()
    println("List: $list1")


    //Multiple Pair inside the Triple
    val myTriple2 = Triple(
        first = Pair(first = "Pair1 Value1", second = "Pair1 Value2"),
        second = Pair(first = "Pair2 Value1", second = "Pair2 Value2"),
        third = Pair(first = "Pair3 Value1", second = "Pair3 Value2")
    )

    //Accessing values

    println(myTriple2.first.first)
    println(myTriple2.first.second)

    println(myTriple2.second.first)
    println(myTriple2.second.second)

    println(myTriple2.third.first)
    println(myTriple2.third.second)

}

fun getPersonInfo(): Pair<String, Int> {
    return Pair("John", 20)
}

fun getEmployeeInfo(): Triple<String, Int, Float> {
    return Triple("John", 20, 25000.5F)
}

