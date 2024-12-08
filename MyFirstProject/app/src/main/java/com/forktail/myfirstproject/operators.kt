package com.forktail.myfirstproject

fun main(args:Array<String>)
{
    // This is used to refine range from a to z
    var myRange = 'a'.rangeTo('z')
    // Alternate syntax -
    var myRange1 = 'a'..'z'

    // Here in checks if the given character is in the range or not
    // This rangeTo can also be used on numbers as well
    var range1Check = 'g' in myRange
    var range2Check = '2' in myRange1

    println("The value g in range one is present? - "+ range1Check)
    println("The value 2 in range 2 is present? - "+ range2Check)

}