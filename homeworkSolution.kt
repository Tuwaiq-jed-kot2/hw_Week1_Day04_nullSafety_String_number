
// part 1
fun main(args: Array<String>) {
    println(getLength("this is a string"))
}
fun getLength(str: String?):Int{
    if (str != null) {
        return str.length;

    }
    return 0
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