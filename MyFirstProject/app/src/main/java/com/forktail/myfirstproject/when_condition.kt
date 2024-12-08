package com.forktail.myfirstproject

fun main(args: Array<String>)
{
    // Here, the when conditional statement is used as an if statement to check for the value provided
    // and execute the corresponding block of code to it
    println("Enter a choice 1,2,3 or 4")
    var option: Int? = readLine()!!.toInt()
    when(option)
    {
        1 -> println("First Option Chosen")
        2 -> println("First Option Chosen")
        3 -> println("First Option Chosen")
        4 -> println("First Option Chosen")
        else -> println("Default value chosen")
    }

}