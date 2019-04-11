/**
* Basics
*/

// Lists can be built using the 'listOf' builder function
val listOfNumbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)
// or, using type inference:
val numbers = listOf(1, 2, 3, 4, 5, 6)

// Lists are fixed size collections too. They are similar to arrays.

// numbers.add(7) -> ERROR
// numbers.remove(0) -> ERROR

// Elements are accessed using the 'get' method, or using '[ ]'
println(numbers.get(0))
println(numbers[0])




/**
* Mutable Lists
*/
val numbersMutable: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6)

// You can add or remove elements from a mutable list
numbersMutable.add(7) // Adds '7' at the end of the list
numbersMutable.remove(1) // Removes first occurence of '1'