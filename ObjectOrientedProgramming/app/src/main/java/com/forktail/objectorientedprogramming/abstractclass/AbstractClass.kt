package com.forktail.objectorientedprogramming.abstractclass

fun main(args: Array <String>)
{
    //var vehicle = Vehicle()
    var car = Car(123)
    car.speed = 100
    // Here we see the use of Abstract class
    // Don't know how cause this part I just didnt get it properly
    // Have to revisit this
    println("Name: ${car.vehicleName("Lamborghini")}\n" +
            "Type: ${car.vehicleType("Car")}\n"+
            "Model: ${car.model}" +
            "Speed: ${car.speed}")





}