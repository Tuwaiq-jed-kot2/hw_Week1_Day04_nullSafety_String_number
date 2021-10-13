fun main(){
    fun getLength(str: String?) : Int {
        // Add null check here

        return str.length;
    }

    fun main(args: Array<String>) {
        println(getLength('This is a string!'))
    }

}