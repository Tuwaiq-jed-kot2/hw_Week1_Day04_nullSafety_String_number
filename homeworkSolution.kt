fun main(){

    getSubstring()
}

val fax = "The quick brown fox jumps over the lazy dog."

fun getSubstring(){
    val brownFox = fax.substring(10,26)
    println("old = $fax")
    println("new = $brownFox")


}