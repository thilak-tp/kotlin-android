package com.forktail.myfirstproject

fun main(args: Array<String>)
{
    /*
    Here readline is used to take a input form the user and ? is to indicate that the user
    might enter null value as well
    */
    println("Enter your name")
    var name:String? = readLine()
    println("Enter your age")
    var age:Int = readln().toInt()

    println("My name is "+name+" and my age is "+ age)

}