package com.example.Kotlin

//10.제어흐름

//when
fun main(args: Array<String>) {
    val value: Int = 3

    when (value) {
        1 -> {
            println("Value is 1")
        }
        2 -> {
            println("Value is 2")
        }
        3 -> {
            println("Value is 3")
        }
        else -> {
            println("Value is not 1~3")
        }

    }


}