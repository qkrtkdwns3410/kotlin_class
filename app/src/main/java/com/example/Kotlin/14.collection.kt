package com.example.Kotlin

//14.Collection
//->list, set, map


//immutable collection ->값을 변경할 수 없는 콜렉션
//List

fun main(args: Array<String>) {

    //List >>중복을 허용한다
    val numberList = listOf<Int>(1, 2, 3)
    println(numberList)


    //Set
    //중복을 허용하지 않는다
    //순서가 없다!
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)

    numberSet.forEach{
        println(it)
    } //numberSet이 하나씩 출력된다


    //Map -> Key,value 방식으로 관리한다
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println()
    println(numberMap.get("one"))

    //mutable list ->값 변경가능한 리스트
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println()
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,5,5)
    mNumberSet.add(10)
    println()
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String,Int>("one" to 1)
    mNumberMap.put("two",2)
    println(mNumberMap)



















}