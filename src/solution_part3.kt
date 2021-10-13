import java.lang.NumberFormatException

fun main() {
    try {
        print("type the temperature in fahrenheit: ")
        val temperature = Integer.valueOf(readLine())
        val newTemperature = (5*(temperature-32)) / 9

        println("$temperature degree Fahrenheit is equal to $newTemperature in Celsius")
    }catch (e: NumberFormatException){
        println("you entered a letter, please rerun the program and enter numbers only")
    }
}
