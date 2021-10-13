fun main() {
    //## Part I - Null Safety.
    println(getLength("This is a string"))

    println()
    //## Part II - Strings.
    val str = "The quick brown fox jumps over the lazy dog."
    val new_str = str.substring(10, 26)

    println("old = $str")
    println("new = $new_str")

    println()
    //## Part III - Numbers.
    fahrenheitToCelsius()

}

//## Part I - Null Safety.
fun getLength(str: String?) : Int {
    // Add null check here
    if (str == null) {
        return 0
    } else {
        print("\"$str\" length is: ")
        return str.length
    }
}

//## Part III - Numbers.
fun fahrenheitToCelsius() {
    var check = false
    while (!check) {
        print("Enter temperature in fahrenheit: ")
        try {
            val tempInFahrenhiet = readLine()?.toDouble()
            if (tempInFahrenhiet != null) {
                val tempInCelsius = ((tempInFahrenhiet - 32) * 5) / 9
                val formter = "%.1f"
                println(
                    "${formter.format(tempInFahrenhiet)} degree Fahrenheit is equal to ${
                        formter.format(tempInCelsius)
                    } in Celsius."
                )
                check = true
            } else {
                println("unexpected error")
            }
        } catch (e: NumberFormatException) {
            println("Type miss match")
        }
    }
}