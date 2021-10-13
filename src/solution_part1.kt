
fun getLength(str: String?) : Int? {
    if (str == null)
        println("0")
    else
        println(str)

    return str?.length;
}

fun main(args: Array<String>) {
    println(getLength("This is a string!"))
}
