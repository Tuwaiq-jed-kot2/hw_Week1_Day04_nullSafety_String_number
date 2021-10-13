fun main() = try{
print("Enter temperature into Fahrenheit : ")
val fahr = Integer.valueOf((readLine()))
val celsius: Double = ((5 * (fahr?.minus(32)!!))/9).toDouble()
println("$fahr degree Fahrenheit is equal to $celsius in Celsius")
}
catch (e: NumberFormatException){
    println("you enter null value")
}