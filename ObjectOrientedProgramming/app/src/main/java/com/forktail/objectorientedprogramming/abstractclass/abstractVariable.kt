package com.forktail.objectorientedprogramming.abstractclass
// Abstract Class
abstract class Vehicle {
    // An abstract function
    abstract fun vehicleName(name:String) : String
    // A non abstract function
    fun vehicleType(type:String) : String
    {
        return type
    }
    // An abstract property
    abstract var model:Int
    // A non abstract property
    var speed:Int? = null

}