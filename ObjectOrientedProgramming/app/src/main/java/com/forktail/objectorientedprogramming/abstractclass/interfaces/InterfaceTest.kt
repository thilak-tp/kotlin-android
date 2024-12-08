package com.forktail.objectorientedprogramming.abstractclass.interfaces

fun main(args: Array<String>)
{
    var vehicle = Vehicles()

    println("Name : ${vehicle.name}")
    vehicle.go()
    vehicle.stop()
}