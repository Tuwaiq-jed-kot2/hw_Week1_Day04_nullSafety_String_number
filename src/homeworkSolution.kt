fun main() {
    fun getLength(str: String?): Int? {

        if (str == null) {
            return 0

        } else {
            return str?.length

        }
    }
    println(getLength("This is a string!"))
}


    fun main() {
        val str1 = "The quick brown fox jumps over the lazy dog"
        val startIndex = 10
        val endIndex = 24
        val substring = str1.subSequence(startIndex, endIndex)
        println("the substring is :" +substring)
        // it must return Inj



    }


fun main() {
    fun addNum(num1 : Double?) :Double {

        return (5* (num1!!.minus(32)) / 9)


    }

    println(addNum(212.0))



}


