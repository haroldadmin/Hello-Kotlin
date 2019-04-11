/**
* Basics
 */

val greeting: String = "Hello, world!"
var greetingMutable: String = "Hello, world!"

// Error
// greeting = "Goodbye, world!"

// Okay
greetingMutable = "Goodbye, world!"




/**
* Type Inference 
*/

val greetingWithoutType = "Hello, world!" // Notice that we did not specify a type
println(greetingWithoutType::class) // Compiler can figure out the type!