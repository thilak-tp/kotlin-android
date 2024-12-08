package com.forktail.myfirstproject

fun main(args: Array<String>) {
    //1 Byte | Default = 0 | Range -128 to 127
    var c: Byte = 12
    //1 Bit | Default = false | Range: Either true or false
    var a: Boolean = true
    //2 Bytes | Default = 0 | Range: 0 to 65535 Unicode Character
    var b: Char = 'R'


    //2 Bytes | Default = 0 | Range: -32768 to 32757
    var d: Short = -356
    //4 Bytes | Default = 0 | Range: -2^31 to 2^31-1
    var e: Int = 43535
    //8 Bytes | Default = 0L | Range: -2^63 to 2^63-1
    var f: Long = 123121312L
    // 4 Bytes | Default = 0.0F | Range: 32 Bit floating point
    var g: Float = 32.32432F
    //8 Bytes | Default = 0.0d | Range: 64 bit floating point
    var h: Double = 12.2132131231
    // Here is one of the examples of type casting, here we are converting from int to double
    var j: Double = e.toDouble()

    var s: String = "Thilak"

    // println automatically adds newline character at the end of each line whereas print doesn't
    println(a)
    println(b)
    println(c)
    println(b)
    println(e)
    println(f)
    println(g)
    println(h)
    println(j)
    // To find the length of the string
    println(s.length)
    // To check if another string is equal to this string or not
    println(s.equals("Thilak"))
    // To check if the string is empty or not
    println(s.isEmpty())
    // To Convert the string to lower case
    println(s.lowercase())
    // To Convert the string to upper case
    println(s.uppercase())
    // To a string to another string
    println(s.plus(" is a Gamer"))
    // We can add two strings by + symbol for concatenation
    println(s + " is fast typer")

    s = "  Thilak "
    // Trim is used to remove spaces in the string
    println(s.trim())

}