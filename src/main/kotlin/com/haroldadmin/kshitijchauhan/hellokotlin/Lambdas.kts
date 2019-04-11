// Declare a list of numbers from 1 to 100
val listOfNumbers = (1..100).toList()

// Filtering this list using the traditional approach
fun filterImperative(list: List<Int>): List<Int> {
    val listOfEvenNumbers = mutableListOf<Int>()
    for (i in list) {
        if (i % 2 == 0) {
            listOfEvenNumbers.add(i)
        }
    }
    return listOfEvenNumbers
}

val filteredList = filterImperative(listOfNumbers)

// OR...

val filteredListShorter = listOfNumbers.filter { it % 2 == 0 } // AWESOME