package com.forktail.objectorientedprogramming

 open class Vehicle {
    var type: String? = null
    var model: String? = null
    var maxSpeed: Int = 0

    fun show()
    {
        println("Type: $type")
        println("Model: $model")
        println("Max Speed: $maxSpeed")
    }
}