import java.lang.NumberFormatException

fun main() {
    try {
        val formatter = "%.4f"
        print("type the temperature: ")
        val temperature :Float = Integer.valueOf(readLine()).toFloat()
        print("type the unit of your temperature (c or f only): ")
        val unit = readLine().toString()
        if (unit == "f") {
            val newTemperature : Float = ((5 * (temperature - 32)) / 9)
            println("$temperature degree Fahrenheit is equal to $newTemperature in Celsius")
        }
        else if (unit == "c") {
            val newTemperature = ((( 9 * temperature) / 5 ) +32).toFloat()
            println("${formatter.format(temperature)} degree Celsius is equal to ${formatter.format(newTemperature)} in Fahrenheit")

        }else {
            println("you entered inconvenient unit, please rerun the program and enter convenient unit")
        }

    }catch (e: NumberFormatException){
        println("you entered a letter, please rerun the program and enter numbers only")
    }
}
