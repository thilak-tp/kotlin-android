package com.forktail.objectorientedprogramming

class MySecondCars {
    // We have to mandatorily initialize
    var name:String? = null
    //Here are not allowing the value to be changed since set is set to private
    // Nut the vale of get is present so we cam get the value of model through the object
    var model:String?  = null
        private set
        get
    // Here the field speed is private so it can only be accessed within the class
    private var speed:Int = 0

    constructor() //Empty secondary constructor
    // A secondary constructor with parameters for the user to
    // give when the object is made
    constructor(name: String, model: String, speed: Int)
    {
        // after this, the first name is of the class
        // and the second name is of the constructor
        this.name = name
        this.model = model
        this.speed = speed
    }
}