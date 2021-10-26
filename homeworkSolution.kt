//fun main(){
//
//    getSubstring()
//}
//
//val fax = "The quick brown fox jumps over the lazy dog."
//
//fun getSubstring(){
//    val brownFox = fax.substring(10,26)
//    println("old = $fax")
//    println("new = $brownFox")
//
//
//}


//fun main(){
//
//    println(getLength("This is s string!"))
//}
//fun getLength(str:String?) :Int{
//
//    if (str == null)
//        return 0
//    else
//
//        return str.length
//}
//
//
//


fun main() {

    print("212.0 degree Fahrenheit is equal to ${add(212.0)} in Celsius")
}

fun add(num1: Double?): Double {
    val x = (5 * (num1?.minus(32)!!) / 9)
    return x
}
