/**
* Basics
*/

val someNumbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
// Or, using type inference:
val someMoreNumbers = arrayOf(1, 2, 3, 4, 5)

// Array are zero-indexed. Their elements can be accessed using '[ ]'
val firstNumber = someMoreNumbers[0]
println(firstNumber)

// Arrays are fixed in side, elements can't be added or removed

// someMoreNumbers.add(6) -> ERROR
// someMoreNumbers.remove(5)  -> ERROR

// They are mutable, however. Existing elements can be changed.
someMoreNumbers[0] = 0
println(someMoreNumbers[0])
