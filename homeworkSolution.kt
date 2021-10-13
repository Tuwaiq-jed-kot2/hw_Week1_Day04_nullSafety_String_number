//part
fun main() {
    try {
        println("write the sentence ")
        val sen = readLine().toString()
        println("which index do you want to start ")
        val index1 = Integer.valueOf(readLine())
        println("last index ")
        val index2 = Integer.valueOf(readLine())
        println("your substrin is: ")
        println(sen.substring(index1, index2))
    }catch (e: NumberFormatException) {
        println("wrong input")
    }
}


//part2
fun main() {
    try {
        println("write the temperature: ")
        val temperature  = Integer.valueOf(readLine()).toFloat()
        val newTemperature  = ((5 * (temperature - 32)) / 9)
        println("the temperature is $newTemperature in Celsius")
    }catch (e: NumberFormatException){
        println("wrong input ")
    }

}





//part3

fun main() {
    try {
        println("write the temperature: ")
        val temperature  = Integer.valueOf(readLine()).toFloat()
        val newTemperature  = ((5 * (temperature - 32)) / 9)
        println("the temperature is $newTemperature in Celsius")
    }catch (e: NumberFormatException){
        println("wrong input ")
    }

}