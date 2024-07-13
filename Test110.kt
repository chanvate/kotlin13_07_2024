fun main(args: Array<String>) {
    val number : Int = 20;
    var result : String = when (number) {
        in 1 .. Int.MAX_VALUE -> "Positive number"
        0 -> "Zero number"
        else -> "Negative number"
    }
    println(result)
}