package com.forktail.objectorientedprogramming.override
// This example is to show function overriding
// THe below class is a parent class and has 3 functions
open class Vehicle {
    open fun start()
    {
        println("The Vehicle has started")
    }
    open fun accelerate(speed: Int)
    {
        println("Vehicle accelerates at $speed")
    }
    open fun stopped()
    {
        println("The Vehicle has stopped")
    }
}