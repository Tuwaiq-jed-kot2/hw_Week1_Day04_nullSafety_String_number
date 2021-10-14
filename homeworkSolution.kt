
Answer 1 :


fun main(){


    println(getLenth("  Hi Iam Sara"))
}

fun getLenth(str:String?):Int{
    if (str==null)
        return 0
    else
    //fun getLenth(): Int {


        return str.length
}



Answer 2 :

fun main(args: Array<String>) {
    val str1 = "Sara Alghamdi"
    val str2 = "Good Morning"
    val startIndex = 0
    val endIndex = 11
    val substring = str1.subSequence(startIndex, endIndex)
    val substring2 = str2.subSequence(startIndex, endIndex)
    println("My name: " + substring)
    println("anything: " + substring2)
}


Answer 3 :


fun main() {
    val celsius =addFahrnenhetNum(null)
    println(celsius)
}
fun addFahrnenhetNum(addFahrnenhetNum : Float?):String {
    if (addFahrnenhetNum==null){
        return(" fahrenheit degree")
//if (addFahrnenhetNum==null){
    }else{
        return ("$addFahrnenhetNum degrees Fahrenheit = ${((addFahrnenhetNum- 32) *5) /9 }degrees Celsius")
    }

}

