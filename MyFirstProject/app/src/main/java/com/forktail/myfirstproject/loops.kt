package com.forktail.myfirstproject

import kotlin.random.Random

fun main(args: Array<String>) {
    // This for loop iterates from 1 to 10 and prints it on the console
    for (number in 1..10){
        println(number)
    }

    var sum:Int = 0

    //This for loop iterates from 0 to 5 and adds all the numbers and gives the sum
    for(x in 0..5)
    {
        println(x)
        sum+=x
    }
    println("The sum of numbers "+sum)
    sum = 0
    // printing only the even numbers from 0 to 5
    for(x in 0..5)
    {
        if(x % 2 == 0)
        {
            println(x)
            sum += x
        }
    }
    println("The sum of even numbers in 0 to 5 is "+ sum)

    var numArr = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    // Here we print all the numbers of the array numArr onto the console using a for loop
    for(y in numArr)
    {
        println(y)
    }
    // To get indices of the array, we put a range from 0 to N-1
    for(y in 0..(numArr.size -1))
    {
        println("My number array[$y] =" +numArr[y])
    }

    //Alternate to access indices of the array
    for(y in numArr.indices)
    {
        println("My number array[$y] =" +numArr[y])
    }
    // Implementation of for each loop, it is a short way of accessing elements
    numArr.forEach{ println(it)}

    //Implementing factorial using while loop
    var k =1
    var fact = 1
    while(k<6)
    {
        fact *= k
        println("$k! = $fact")
        k++
    }

    // Here Random.nextInt(range) is used to generate random numbers between the given range
    val number = Random.nextInt(0,100)
    println("Enter a number")
    while(true)
    {
        val userGuess:Int = readLine()!!.toInt()
        if(userGuess == number)
        {
            println("Congratulations, you know the number in my mind")
            break
        }
        else if(userGuess < number)
        {
            println("Increase you guess")
        }
        else{
            println("Decrease you guess")
        }

    }

}

