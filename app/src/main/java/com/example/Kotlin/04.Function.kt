package com.example.Kotlin

//함수.
//fun 함수명 (변수명 : 타입, 변수명: 타입...) : 반환형 {
//          함수내용
//          return 반환값
//}
fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

//-디폴드 값을 갖는 함수 만들기
fun plusfive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

//-반환값이 없는 함수 만들기
fun Printplus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

//반환값이 없는 함수 -Unit표기안해도 OK합니다.
fun Printplus2(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

//간단하게 함수 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second

//가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int){
    for (number in numbers){
        println(number)
    }
}


fun main(array: Array<String>) {
    val result: Int = plus(5, 10)
    println(result)

    //-디폴트 값을 갖는 함수 호출하기
    println()
    val result4 = plusfive(10, 20)
    println(result4)

    //반환값없는 함수 호출하기
    println()
    Printplus(10, 20)
    //간단한 함수 출력
    println()
    plusShort(10, 20)
    //가변인자...
    println()
    plusMany(1,2,3 )
}