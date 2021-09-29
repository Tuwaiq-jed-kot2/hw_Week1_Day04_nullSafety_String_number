fun main() {
    getSubstring()
}
val fox = "The quick brown fox jumps over the lazy dog."
fun getSubstring(){
    val brownFox  = fox.substring(10, 26)
    println("old = $fox")
    println("new = $brownFox")
}