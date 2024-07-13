fun main(args: Array<String>) {
    val number : Int = 20;
    when (number) {
        in 1 .. Int.MAX_VALUE -> print("Positive number")
        0 -> print("Zero number")
        else -> print("Negative number")
    }
}