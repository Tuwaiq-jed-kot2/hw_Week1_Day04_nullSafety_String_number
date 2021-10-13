//Part 1 Null Safety
fun getLength(str: String?) {
    // Add null check here
    if (str != null)
    {
        println("The Length of the String = " + str.length)
    }
    else
    {
        println(0)
    }
}

fun main(args: Array<String>) {
    println("Enter a string")
    var str1 = readLine()
    getLength(str1)
}