fun main(args: Array<String>) {
    println("Hello world")
}

fun Int.isLeapYear() = when {
    this % 400 == 0 -> true
    this % 100 == 0 -> false
    else -> TODO()
}