# HW_Week1_Day4_StringsAndNumbers 😃
---
The HomeWork has three components:
- Null safety.
- Strings.
- Numbers.

    > Note: You must save your solution as `solution.kt` to be submitted before 9AM.
# Instructions 📋

## Part I - Null Safety.
---
In the code below, add an `if` statement to the beginning of `getLength` that
returns zero if `str` is null:

<?code-excerpt "null_safety_codelab/bin/type_promotion.dart" replace="/.*if\ \(.*\n.*\n.*//g"?>
```dart:run-dartpad:ga_id-null_checking:null_safety-true
fun getLength(str: String?) : Int {
    // Add null check here
    
    return str.length;
}

fun main(args: Array<String>) {
  println(getLength('This is a string!'))
}
```
fun getLength(str: String?) {
// Add null check here
val str:String?=null
if (str != null) {
println (str.length)
}
}

    fun main(args: Array<String>) {
        println(getLength("This is a string!"))
    }
## Part II - Strings.
---
###  Write a Kotlin program to get a substring of a given string between two specified positions.
###### Sample Output:

> old = The quick brown fox jumps over the lazy dog.                                                            
new = brown fox jumps.

fun main(args:Array<String>) {
val str1="The quick brown fox jumps over the lazy dog."
val startIndex=9
val enIndex=25

    val Substring= str1.subSequence(startIndex,enIndex)
    println("old:$str1")
    println("new"+Substring)

}

## Part III - Numbers.
---
###  Write a Kotlin program to convert temperature from Fahrenheit to Celsius degree.
#### Input a degree in Fahrenheit: 212 Or Null

###### Use this equation:
>  C = (5 (F-32)) / 9.

import java.util.*

fun main(args: Array<String>) {

    //Input Stream
    val scanner = Scanner(System.`in`)

    //Input temperature in Fahrenheit
    print("Enter temperature into Fahrenheit : ")
    val fahrenheit = scanner.nextDouble()

    //Convert  Fahrenheit to Celsius
    val celsius =( (fahrenheit  -  32  ) *  5)/9

    //Print temperature in Celsius
    println("Temperature in Fahrenheit ($fahrenheit) = Celsius ($celsius)")
}

###### Expected Output:

> 212.0 degree Fahrenheit is equal to 100.0 in Celsius.

# Learning Resources  📚
* [Null Safety in Kotlin](https://kotlinlang.org/docs/reference/null-safety.html)
* [Strings in Kotlin](https://www.w3schools.com/kotlin/kotlin_strings.php)
* [Numbers in kotlin](https://kotlinlang.org/docs/basic-types.html#floating-point-types)
