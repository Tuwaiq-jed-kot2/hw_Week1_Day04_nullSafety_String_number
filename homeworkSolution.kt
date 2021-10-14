//  part1

fun getLength(str: String?) : Int {
    if (str == null) {
        println("Zero")

    } else
        println(" safe call")
    return str?.length
}
fun main(args: Array<String>) {
    println(getLength("This is a string!"))
}

// Part2

fun main() {
    val text ="he quick brown fox jumps over the lazy dog"

    println(text.substring(8))
}
fun substring(startIndex: Int, endIndex: Int){
}

// Part3

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    print("Enter temperature into Fahrenheit : ")
    val fahrenheit = scanner.nextDouble()

    val celsius =( (fahrenheit  -  32  ) *  5)/9

    println("Temperature in Fahrenheit ($fahrenheit) = Celsius ($celsius)")
}

