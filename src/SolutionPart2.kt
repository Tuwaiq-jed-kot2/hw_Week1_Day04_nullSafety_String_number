//Part 2 String Substring

fun main() {
    val oldStr ="The quick brown fox jumps over the lazy dog"
    val newStr : String
    val startIndex = 10
    val endIndex = 25
    val substring = oldStr.subSequence(startIndex,endIndex)
    println("old = $oldStr \n new = $substring")
}