package com.example.Kotlin

//18.Class
//OOP -> object Oriented Programing (객체지향 프로그래밍)
//객체?
//->이름이 있는 모든 것
//절차 지향 프로그래밍
//-코드를 위에서 부터 아래로 실행을 하면 문제가 해결된다!

//객체 지향 프로그래밍 문제 해결
//-> 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다
//선수 심판 경기장 관중 -- 축구 게임


//객체를 만드는 방법
//-설명서가 있어야합니다
//
fun main(array: Array<String>) {

    //클래스를 통해서 실체를 만드는 방법
    //인스턴스 화 ->인스턴스(객체)


    val bigCar = Car("v8 engine", "big")

    //우리가 만든 클래스(설명서)는 자료형이 된다
    val bigCar1: Car = Car("v8 engine", "big")


}

//클래스(설명서) 만드는 방법(1) //var val 이런거 만들어줘야합니다.
class Car(var engine: String, var body: String) {

}
//클래스 (설명서)만드는 방법(2)
class SuperCar{
    var engine : String
    var body: String
    var door : String

    constructor(engine : String, body : String, door: String)

}