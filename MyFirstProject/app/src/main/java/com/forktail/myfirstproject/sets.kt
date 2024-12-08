package com.forktail.myfirstproject

fun main(args: Array<String>)
{
    // comparison between an array list and a set

    // Declaring an array list
    var arrayl = arrayListOf<String>("BMW", "BMW", "MAZDA")

    println("The size of the array is "+ arrayl.size)
    println("The last element of the array is "+ arrayl.last())

    // Declaring a set
    var setl = setOf<String>("BMW", "BMW", "MAZDA")
    println("The size of the array is "+ setl.size)
    println("The last element of the array is "+ setl.last())
}