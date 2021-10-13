fun main() {
    val fahrenheit :Double?= 212.0
    val fahrenheit2 :Double?= null

    toCelsius(fahrenheit)
    toCelsius(fahrenheit2)
}

fun toCelsius (Fahrenheit:Double?){
    try {
        val celsius = (5 * (Fahrenheit?.minus(32)!!))/9
        println("$Fahrenheit degree Fahrenheit is equal to $celsius")
    }
    catch (e:NullPointerException){
        println("Double value should be added")
    }
    catch (e:Exception){
        println(e)
    }

}