
// part 1
fun main() {
    println(getLength("This is a string"))

}
fun getLength(str: String?): Int {
    val num1 =
        if (str != null) str.length
        else 0
    return str.length
}



}


// part 2
fun main(){

    val old:String = " The quick  brwon  fox jumps over lazy dog"
    println(old)
    println(old.substring(10,29))

}


//part 3
fun main() {
    val fahrenheit:Int?=212
    val Celsius : Double= 5*(fahrenheit?.toDouble()!!-32)/9
    println("Celsius $Celsius")
}