//Part I - Null Safety.
fun main() {
    getLength()
}
fun getLength(){
    val str: String? = null
    // val str: String? = readLine()
    if (str != null && str.length > 0) {
        print(str+" \nString of length ${str.length}")
    } else if(str==null) {

        print("0 String of length ")
    }else{
/*  */
        print("Erorr")
    }}



/*
fun getLength(str: String?) : Int {
 //var getLength: String? =null
var str1 =5

    if (str == null) {
        return 0
        println(0)
    } else {
        return str.length
    }

    // return str.length

}*/