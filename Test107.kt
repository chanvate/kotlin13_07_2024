fun main(args: Array<String>) {
    val time = 20
    var greeting : String = if(time < 18) {
        "Good Day"
    } else {
        "Good Night"
    }
    println(greeting)
}