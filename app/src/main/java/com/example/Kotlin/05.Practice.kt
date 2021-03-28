package com.example.Kotlin

fun plusThree(first: Int, second: Int, third: Int): Int {
    return first + second + third
}

fun minusThree(first: Int, second: Int, third: Int): Int {
    return first - second - third
}

fun multiplyThree(first: Int = 1, second: Int = 1, third: Int = 1) = first * second * third

//내부함수
//함수 안에 들어있는 함수
fun showbyPlus(first: Int, second: Int): Int {
    println(first)
    println(second)

    fun plus(first: Int, second: Int): Int {
        return first + second
    }
    return plus(first, second)
}


fun main(array: Array<String>) {
    val result = plusThree(1, 2, 3)
    println(result)
    val result2 = minusThree(10, 1, 2)
    println(result2)
    val result3 = multiplyThree(2, 2, 2)
    println(result3)
    val result4 = multiplyThree()
    println(result4)

    //내부함수
    val result5 = showbyPlus(3,4)
    println(result5)
}
