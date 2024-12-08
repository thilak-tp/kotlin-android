package com.forktail.objectorientedprogramming

fun main(args: Array<String>)
{
    // Here Car in itself has no state variables and nor does motorcycle but they inherit all the
    // Properties below by inheriting all these properties from the Parent Class Vehicle
    var car = Car()
    car.type = "Car"
    car.model = "Ferrai"
    car.maxSpeed = 200

    var motor = MotorCycle()
    motor.type = "Motorcycle"
    motor.model = "Yamaha"
    motor.maxSpeed = 150

    motor.show()
    car.show()

}