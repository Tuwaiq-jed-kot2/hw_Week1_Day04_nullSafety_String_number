
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

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)

    print("Enter temperature into Fahrenheit : ")

    val fahrenheit = scanner.nextDouble()

    val celsius = ((fahrenheit - 32) * 5) / 9

    println("$fahrenheit degree Fahrnheit is equal too $celsius in Celsius")

}