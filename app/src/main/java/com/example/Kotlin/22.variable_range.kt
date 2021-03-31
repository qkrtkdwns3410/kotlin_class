package com.example.Kotlin

//변수의 접근범위
//1. 전역 변수
//2. 지역 변수
var number100 :Int =10

fun main(args:Array<String>){
    println(number100)
    val test =Test("홍길동")
    test.testFun()
    println(test.name)
    println(number100)
}

class Test(var name:String){
    fun testFun(){
        var birth :String = "2000/11/03"
        number100 =100
        name = "홍길동"
        //gender 사용안됨
        fun testFun2(){
            val gender:String = "남자"
        }
    }

    fun testFun2(){
        name

    }
}