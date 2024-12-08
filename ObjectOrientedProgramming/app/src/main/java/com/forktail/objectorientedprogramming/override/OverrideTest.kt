package com.forktail.objectorientedprogramming.override

fun main(args: Array<String>)
{
    // Here we are calling all the functions in the class Vehicles
    var vehicle = Vehicle()
    vehicle.start()
    vehicle.accelerate(11)
    vehicle.stopped()
    /* Here we are calling the same functions but since cars has overriding functions in it over the vehicle functions, its functions are executed */
    var car = Car()
    car.start()
    car.accelerate(12)
    car.stopped()
    // Now since car class has overriden the start accelerate and stop functions from the parents class vehicle
    // We can user super functions as in the class car to call the parent functions
    car.superStart()
    car.superAccelerate()
    car.superStop()


}