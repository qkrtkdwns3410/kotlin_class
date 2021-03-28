package com.example.Kotlin

import androidx.annotation.ArrayRes

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1,2,3)
    a.add(4)
    println(a)
    a.add(0,100)
    //값이 있을 경우 리스트안의 값을 밀어낸다.
    println(a)
    a.set(0,200) //해당 인덱스값을 바꾼다. (set)
    println(a)
    a.removeAt(1) //인덱스 1이 제거
    println(a)

    val b = mutableSetOf<Int>(1,2,3,4)
    println()
    b.add(2)
    println(b)
    b.remove(2)
    println(b)

    val c = mutableMapOf<String,Int>("one" to 1)
    println()
    c.put("two",2)
    println(c)
   // c.replace("two",3)
    println(c)
    println(c.keys)
    println(c.values)
    c.clear()
    println(c)






































}