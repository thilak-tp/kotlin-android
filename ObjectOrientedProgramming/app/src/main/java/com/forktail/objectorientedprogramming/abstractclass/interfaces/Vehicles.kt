package com.forktail.objectorientedprogramming.abstractclass.interfaces

class Vehicles: CanGo, CanStop {
    override  val name: String
        get() = "Ferrari"

    override fun stop() {
        println("Vehicle can stop")
    }
}