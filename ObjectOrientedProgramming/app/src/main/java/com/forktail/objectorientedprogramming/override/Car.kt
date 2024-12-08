package com.forktail.objectorientedprogramming.override

class Car: Vehicle() {

    fun superStart()
    {
        super.start()
    }
    fun superAccelerate()
    {
        super.accelerate(20)
    }
    fun superStop()
    {
        super.stopped()
    }

    override fun start()
    {
        println("The car has started")
    }
    override fun accelerate(speed: Int)
    {
        println("car accelerates at $speed")
    }
    override fun stopped()
    {
        println("The car has stopped")
    }
}