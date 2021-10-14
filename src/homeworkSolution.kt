fun main() {

    //part 1
    println(getLength("This is a string!"))

    //part 2
    val oldString = "The quick brown fox jumps over the lazy dog."
    val newString = oldString.substring(10 , 25)
    println("$newString.")

    //part 3
    val f:Float? = 212.0f
    val c:Float? = ((f?.minus(32))?.times(5))?.div(9)
    val cIn1digits = if ( f != null) {
        String.format("%.1f",c).toFloat()
    } else{
        c
    }
    println("$f degree Fahrenheit is equal to $cIn1digits Celsius")

}
fun getLength(str: String?) : Int {
    println(str)
    return if (str != null) {
        str.length
    } else 0
}