fun main(){
    //PartI
    println(getLength("This is a string!"))
    //PartII
    println("old = The quick brown fox jumps over the lazy dog.")
    println("new = ${subStr("The quick brown fox jumps over the lazy dog.")}.")
    //PartIII
    println(convTemp(212.0))
}
//PartI
fun getLength(str: String?) : Int {
    if(str == null) {
        return 0
    }else{
        return str.length
    }
}
//PartII
fun subStr(oldStr:String):String{
    return oldStr.substring(9..25)
}
//PartIII
fun convTemp(F:Double): String {
    return "$F degree Fahrenheit is equal to ${ ((F - 32) * 5) / 9 } in Celsius."
}
