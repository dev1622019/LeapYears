fun main(args: Array<String>) {
    print("Enter a year: ")

    readLine()?.let {
        try {
            val year = it.toInt()

            if (year.isLeapYear()) {
                println("The year $year is a leap year")
            } else {
                println("The year $year is not a leap year")
            }
        } catch (e: NumberFormatException) {
            println("The input was not valid")
        }
    } ?: println("No input found")
}

fun Int.isLeapYear() = when {
    this % 4000 == 0 -> false
    this % 400 == 0 -> true
    this % 100 == 0 -> false
    this % 4 == 0 -> true
    else -> false
}