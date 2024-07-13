fun main(args: Array<String>) {
    val remain = (-123..123).random()
    var result = if(remain > 0) "positive" else "negative"
    println(result)
}