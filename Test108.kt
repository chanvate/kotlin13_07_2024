fun main(args: Array<String>) {
    val day = 4;
    var result = when(day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thrusday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid day"
    }
    println(result)
}