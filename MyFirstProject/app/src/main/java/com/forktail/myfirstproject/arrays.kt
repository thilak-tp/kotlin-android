package com.forktail.myfirstproject

fun main(args:Array <String>) {
    // An array is a collection of homogeneous values
    // This is an array of intergers
    // var arrayName = arrayOf(list of elements separated by commas)
    var age = arrayOf(1, 2, 3)
    println("The first element of the array is " + age[0])
    println("The second element of the array is " + age[1])
    println("The third element of the array is " + age[2])

    // An array of strings
    var cars = arrayOf("Lamborghini Gallardo", "Toyota Supra", "Nissan Skyline GTR")
    println("The first element of the array is " + cars[0])
    println("The second element of the array is " + cars[1])
    println("The third element of the array is " + cars[2])

    // To change the value of an array
    cars.set(2, "Mitsubishi Eclipse")
    println("The Third element of the array is " + cars[2])

    // To find the size of the arrays, it means on the number of members in the array
    println("The size of the age array is " + age.size)
    println("The size of the cars array is " + cars.size)

    // Arrays can store different datatypes of data as well
    var carsAndAge = arrayOf("Mercedes", 5, "Mazda", 2)

    println("The first element of the array is " + carsAndAge[0])
    println("The second element of the array is " + carsAndAge[1])
    println("The third element of the array is " + carsAndAge[2])
    println("The fourth element of the array is " + carsAndAge[3])

    // Adding elements to the array
    //carsAndAge.set(4, "20");

    //ArrayList
    // Syntax var arrayListName = arrayListOf<datatype>(list of elements separated by commas)
    // Syntax var arrayListName = ArrayList<datatype>()

    // This type of arraylist declaration is used to initialize the arraylist while declaring
    var arr = arrayListOf<Int>(1, 2, 3)
    // This type of arraylist declaration is used when only to declare and not to initialize in the samne line
    var arr1 = ArrayList<Int>()
    arr1.add(10)
    arr1.add(1, 20)
    arr1.add(30)

    println("First element of the array is " + arr1[0])
    println("Second element of the array is " + arr1[1])
    println("Third element of the array is " + arr1[2])
    // A dollar sign with {} can be used to use the value of a variable in a string to print it
    println("Third element of the array is  ${arr1[2]}")


    //To remove the elements from an array
    arr1.remove(20)
    println("First element of the array is " + arr1[0])
    println("Second element of the array is " + arr1[1])
    //println("Third element of the array is " + arr1[2])

}
