package com.forktail.objectorientedprogramming

fun main(args: Array<String>)
{
    var myCar = Cars()
    myCar.name = "Lamborghini"
    myCar.model = "Gallardo"
    println("My cars name is ${myCar.name} ${myCar.model}")

    //Here were are calling the Primary Constructor of the MyCars class
    var myCar1 = MyCars("Toyota","Supra")
    println("My cars name is ${myCar1.name} ${myCar1.model}")





    // This works fine since we have an empty constructor
    //var mySecondCar = MySecondCars()
    // Calling a secondary constructor is as below
    var mySecondCars = MySecondCars("Nissan", "Skyline GTR", 200)
    println("My Second cars name is ${mySecondCars.name} ${mySecondCars.model}")
    // Here setter is private for class member model so we can't assign a value to it
    //mySecondCars.model = "Hello"
    // But since the getter is enabled, we can access the existing value, this helps encapsulation
    println("The value of the model is ${mySecondCars.model}")
}
