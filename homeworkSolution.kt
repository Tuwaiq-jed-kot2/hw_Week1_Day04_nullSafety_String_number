/*--------------------------------Answer(Part I)----------------------------------*/

//fun main(args: Array<String>) {   //Answer Q1 (Start)
//    println(getLength("This is a string!"))
//}
//
//fun getLength(str: String?) : Int {
//    if (str == null)
//    {
//        return
//    }
//
//    else return str.length;
//}//(End)



/*--------------------------------Answer(Part II)---------------------------------*/

//fun main() {    //Answer Q2 (Start: First Way)
//    val sentence : String = "The quick brown fox jumps over the lazy dog"
//    println(sentence.substring(10,25))
//}//(End)

/*----------------->//Answer Q2 in another way with null sefty calls:-*/

//fun main() {// Answer Q2 (Start: Second Way)
//    cutten("The quick brown fox jumps over the lazy do")
//}
//fun cutten(sentence:String?)
//{
//    if (sentence == null)
//    {
//        println("Write The Sentence")
//    }
//    else {
//        println(sentence.substring(10, 25))
//    }
//}//End



/*--------------------------------Answer(Part III)---------------------------------*/

//fun main() { // Answer Q3 (Start:First Way)
//    celsiusDegree(212.0f)
//}
//fun celsiusDegree(fahrenheitDegree:Float) =
//    println("$fahrenheitDegree degree Fahrenheit is equal to ${(5*(fahrenheitDegree-32))/9} in Celsius ") //End

/*----------------->//Answer Q3 in another way with null sefty calls:-*/

fun main() { // Answer Q3 (Start:Second Way)
    val celsius = fahrenheitToCelsiusTo(null)
    println(celsius)
}
fun fahrenheitToCelsiusTo(fahrenheitDegree:Float?) :String {
    if (fahrenheitDegree == null) {
        return "Enter Fahrenheit Degree"
    } else {
        return "$fahrenheitDegree degree Fahrenheit is equal to ${(5 * (fahrenheitDegree - 32)) / 9} in Celsius " //End
    }
}