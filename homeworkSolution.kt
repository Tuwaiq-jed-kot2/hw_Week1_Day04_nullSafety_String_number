
//part 1 - null safty
fun main (){

    fun getLength(str: String?) : Int {
        if(str == null)
            return 0
        else
            return str.length;
    }

    fun main(args: Array<String>) {
        println(getLength("This is a string!"))
    }
}

//.....................................................//

//part 2 - String

fun main() {
    val oldstr = "The quick brown fox jumps over the lazy dog."

    println("old =" + oldstr.substring(0..43))
    println("new =" + oldstr.substring(9..24))

}

//.......................................................//

//part 3 - Numbers

fun main()  {

    val fahrenheit:Double? = 212.0  // or null

    if (fahrenheit != null) {

        val celsius:Double? = (fahrenheit?.minus(32))?.times(5)?.div(9)

        println("$fahrenheit degree Fahrnheit is equal too $celsius in Celsius")

    }else{
        println("enter null value")
    }

}

