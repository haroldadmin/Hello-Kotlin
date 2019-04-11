/**
* Basics
*/

fun returnHello(): String {
    return "Hello!"
}

// This function is quite small, so we can write in a single line
fun returnHelloShorter() = "Hello!"

// The compiler can infer the return type to be string, but you can explicitly mention it too
fun returnHelloWithType(): String = "Hello!"

/**
* Functions that don't return anything return Unit
*/
fun returnNothing(): Unit {
    // Do stuff
    // Return nothing
}
// Returning Unit is equivalent to returning Void in some languages




/**
* Function Parameters
*/
fun functionWithParameters(awesomeParameter: String) {
    // awesomeParameter = awesomeParameter.toUpperCase()
    // ERROR: You can not modify function input parameters
    
    println(awesomeParameter)
}

// You can access values outside the function scope, though.
// If these values are mutable, their value can be changed.
var outerParameter = 42

fun anotherFunction() {
    outerParameter = 41
    println(41)
}
anotherFunction()

// FUNCTION PARAMETERS ARE ALWAYS PASSED BY REFERENCE!
val myString = "My String!"
fun passByReference(str: String) {
    // Use === operator to check if two objects are the same object
    println(str === myString)
}
passByReference(myString)