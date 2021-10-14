fun getLength(str: String?) : Int? {
    if (str == null) {
        return 0
    } else {
        println(str)
    }
    return str?.length;
}
fun main(args: Array<String>) {
    println("Enter sentence you want to count: ")
    val sen : String = readLine().toString()
    println(getLength(sen))
}