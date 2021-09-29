package com.includehelp

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