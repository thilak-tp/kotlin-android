package com.forktail.myfirstproject

fun main(args: Array<String>)
{

    // A collections map is used to store key value pairs
    // Syntax var mapName = mapOf<key datatype, value datatype>(key1 to value1, key2 to value2 ...)
    var map1 = mapOf<String, Int>("Thilak" to 1, "Meghana" to 2)
    println("The value of key Thilak is " + map1["Thilak"])
    println("The value of key Meghana is " + map1["Meghana"])

    var mutMap = mutableMapOf<String, Int>("Thilak" to 1, "Meghana" to 2)
    // To add a key value for a mutable map we use put
    mutMap.put("Akash", 3)

    println("The value of Akash is "+ mutMap["Akash"])


}