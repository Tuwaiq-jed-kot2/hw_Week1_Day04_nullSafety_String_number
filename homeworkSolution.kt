
// part 1
fun main() {
    println(getLength("This is a string"))

}
fun getLength(str: String?): Int {
    if (str == null) {
        println(8)
    } else
        println("safe")

    return str?.length!!
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