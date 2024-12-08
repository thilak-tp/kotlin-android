package com.forktail.objectorientedprogramming.abstractclass

class Car(override var model: Int): Vehicle() {
    override fun vehicleName(name: String): String {
       return name
    }
}