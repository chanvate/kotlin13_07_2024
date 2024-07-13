fun main(args: Array<String>) {
    val number : Int = (-111..112).random()
    var result : String = when (number) {
        in 1 .. Int.MAX_VALUE -> "Positive number"
        0 -> "Zero number"
        else -> "Negative number"
    }
    println("Result:"+result+" || "+"Number:"+number)
}