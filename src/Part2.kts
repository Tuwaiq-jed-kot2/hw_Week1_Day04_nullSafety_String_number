import kotlin.system.exitProcess

fun main() {

    while (true) {


        println("Please choose either 1. Enter a string or 2. Exit")

        when (Integer.valueOf(readLine())) {
            1 -> {
                try {
                    println("Please enter a string")
                    val str = readLine()
                    subString(str!!)

                } catch (e: NullPointerException) {
                    println("You can't enter null")
                }
            } 2 -> {
            println("Goodbye.")
            exitProcess(0)
        } else -> println("choose only 1 or 2")


        }
    }
}


fun subString(str: String) {
    println("Enter the first index")
    val firstIndex = Integer.valueOf(readLine())
    println("Enter the second index")
    val secondIndex = Integer.valueOf(readLine())
    println("Old: $str")
    println("New: " + str.substring(firstIndex, secondIndex))
}


