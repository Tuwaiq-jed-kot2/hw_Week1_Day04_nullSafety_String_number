import kotlin.system.exitProcess

fun getLength(str: String?) : Int {
    // Add null check here
    if (str == null) {
        return 0
    }

    return str.length
}

fun main(args: Array<String>) {

    while (true) {

        println("Please choose either 1. Enter a string or 2. Exit")

        when (Integer.valueOf(readLine())) {
            1 -> {
                println("Please enter a string")
                var str: String? = readLine()
                println(str)
                println(getLength(str))
            }
            2 -> {
                println("Goodbye.")
                exitProcess(0)
            }
            else -> {
                println("Choose only 1 or 2")
            }
        }
    }
}