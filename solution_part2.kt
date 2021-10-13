import java.lang.NumberFormatException

fun main() {
    try {
        print("type the sentence you want to cut: ")
        val sentence = readLine().toString()

        print("type the first index from the sentence you want to cut: ")
        val firstIndex = Integer.valueOf(readLine())

        print("type the last Index from the sentence you want to cut: ")
        val lastIndex = Integer.valueOf(readLine())


        print("you're new sentence is: ")
        println(sentence.substring(firstIndex, lastIndex))
    }catch (e: NumberFormatException) {
        println("you entered a letter, please rerun the program and enter numbers only")
    }

}
