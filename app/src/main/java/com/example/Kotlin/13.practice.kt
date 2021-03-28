package com.example.Kotlin

fun main(Array: Array<String>) {
    val array = arrayOf<Int>(1, 2, 3)

    //get, set
    val number = array.get(0)
    println(number)
    /*val number1 = array.get(100)
    println(number1)*/


    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

    //Array의 Bounds
    // -처음 만들때 결정 된다

    //Array를 만드는 방법(3)
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('b', 't')
    //char -> ' ' , sting -> " "
    val a3 = doubleArrayOf(3.4, 4.6)
    val a4 = booleanArrayOf(true, false)


    //Array를 만드는 방법(4)
    var a5 = Array(10,{0})
    //lambda를 활용한 방법
    var a6 = Array(5,{1;2;3;4;5})

}