package com.example.Kotlin

//16. iterable

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //반복하는 방법 (1)
    for (item in a) {
        if (item == 5) {
            println("item is Five")
        } else {
            println("item is not Five")
        }
    }
    println()

    //반복하는 방법(2)
    for ((index, item) in a.withIndex()) {
        println("index : " + index + " value : " + item)
        //문자열  + Int(정수) = 문자열
        //문자열 + 아무거나 = 문자열

    }

    //반복하는 방법(3)
    a.forEach {
        println(it)
    }
    println()
    //반복하는 방법(4)
    a.forEach { item ->
        println(item)
    }
    //
    a.forEachIndexed { index, item ->
        println("index : " + index + " value : " + item)

    }

    //반복하는 방법(6)
    println(a.size)

    for (i in 0 until a.size) {
        //until은 마지막을 포함하지 않는다
        // 0부터 8까지이다.
        println(a.get(i))
    }
    println()

    //반복하는 방법(7)
    for (i in 0 until a.size step (2)) {
        println(a.get(i))
    }
    println()

    for (i in a.size - 1 downTo (0)) {
        print(a.get(i))
    }
    println()
    //반복하는 방법 (9)
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a.get(i))

    }
    //반복하는 방법 (10)
    for (i in 0..10) { //until은 마지막 숫자를 제외한다
        //그러나 '..'같은 경우 마지막 숫자로 포함합니다.

        println(i)
    }
    //반복하는 방법 (11)
    var aa: Int = 0
    var b: Int = 4

    while (aa < b) {
        aa++
        println("b")
    }

    //반복하는 방법 (12)
    do { //무조건 한번은 실행됩니다.표준이
        println("hello")
    } while (aa < b)
}






















