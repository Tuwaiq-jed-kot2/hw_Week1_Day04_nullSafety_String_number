fun main(args: Array<String>) {
    println(getLength('This is a string!'))
}
    fun getLength(str: String?) : Int {
        // Add null check here
        if(str!=null)
        return str.length;
    }


