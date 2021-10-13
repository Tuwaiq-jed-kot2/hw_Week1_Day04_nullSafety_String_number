//Part 3 Fahrenheit to Celsius degree

fun main() {
    println("Enter the Fahrenheit degree")
    try {
        val fahDeg = Integer.valueOf(readLine())
        var celDeg: Double = ((5 * (fahDeg - 32.0)) / 9.0)
        println("$fahDeg degree in Fahrenheit is equal to ${"%.2f".format(celDeg)}")
    } catch (e: NumberFormatException) {
        println("Please Enter a number")
    }
}