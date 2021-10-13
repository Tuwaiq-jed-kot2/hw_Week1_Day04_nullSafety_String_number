import java.lang.NullPointerException

fun main() {

    println("Please enter a value")
    fToC(readLine()?.toDoubleOrNull())
}

fun fToC(F: Double?) {

    try {
        val c: Double = ((5*(F?.minus(32)!!)) / 9)
        println("$F degree Fahrenheit is equal to $c in Celsius.")
    } catch (e: NullPointerException) {
        println("You entered null")
    }
}