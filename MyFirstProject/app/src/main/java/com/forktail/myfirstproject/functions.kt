package com.forktail.myfirstproject

fun main(args: Array<String>)
{
    println("Enter the first number")
    var number1:Int = readLine()!!.toInt()
    println("Enter the second number")
    var number2:Int = readLine()!!.toInt()

    show(number1, number2)
    var result: Int = add(number1, number2)
    var minimum: Int = findMinimumNumber(number1, number2)
    println("The sum of these two number is $result and the minimum of these two numbers is $minimum")


}

fun show(num1:Int, num2:Int)
{
    println("You have entered $num1, $num2")
}

fun add(num1:Int, num2:Int): Int
{
    var sum = 0;
    sum = num1 + num2
    return sum
}

fun findMinimumNumber(num1:Int, num2:Int):Int
{
    var min = 0
    if(num1 < num2)
    {
        min = num1
    }
    else (num1 > num2)
    {
        min = num2
    }
    return min
}