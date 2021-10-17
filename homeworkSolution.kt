fun main() {
    println("Part I - Null Safety")
    println(getLength("This is a string!"))
    println(getLength(null))
    println("Part II - Strings")
    try {
        println("Enter sentence:")
        val str = readLine().toString()

        println("Enter start string index from sentence to cut it")
        val start = Integer.valueOf(readLine())

        println("Enter last string index from sentence to cut it")
        val end = Integer.valueOf(readLine())
        println(getSubStr(str,start,end))
    }catch (e: NumberFormatException) {
        println("please enter valid input, must enter numbers only")
    }catch (e: StringIndexOutOfBoundsException) {
        println("please enter valid input, must enter starter point greater than end point")
        println(e)
        // also have exception when select last Index of sentence is more than sentence index
    }

    println("Part III - Numbers")
    print("Enter temperature in Fahrenheit do you want to convert it")
    val tempFahr :Float = readLine()!!.toFloat()
    println("$tempFahr degree Fahrenheit is equal to ${toCelsius(tempFahr)} in Celsius")

}

fun getLength(str: String?) : Int {
    if (str == null) {
        return 0
    }
    return str.length;
}

fun getSubStr(str:String, start:Int, end:Int) : String{
    return str.substring(start,end)
}

fun toCelsius (temp:Float) : Float{
    return ((5 * (temp - 32)) / 9)
}