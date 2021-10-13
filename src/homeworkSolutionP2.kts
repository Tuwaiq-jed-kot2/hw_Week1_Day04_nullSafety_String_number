fun main() {
    subStr()
    fahernToCelc()


}
fun subStr() {
    val old = "The quick brown fox jumps over the lazy dog."
    val old1=(old.substring(9..24))
    println("$old1.")
}


//---------PART2--------
fun fahernToCelc(){
    val faher:Float = 476.0f
    var convertToCelc= ((faher - 32) * 5 / 9)
    println(" $faher degree Fahernheit is equal to $convertToCelc in Celsus.")
}





