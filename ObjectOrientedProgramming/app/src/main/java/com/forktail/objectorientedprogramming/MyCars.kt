package com.forktail.objectorientedprogramming
// The below example is of the use of a primary constructor
class MyCars constructor(var name:String,var model:String){
// Note that once you write your state variables of the class on the constructor you don't have
// to re declare them inside the class
    init {
        //We cam only write something inside the contructor if we write it insde the init scope
        println("My cars name is $name $model")
    }
}