package com.example.Kotlin


//23.접근 제어자
fun main(args: Array<String>) {
    val testAccess: TestAccess = TestAccess("아무개")

    //private 키워드 때문에 외부에서 더 이상 사용할 수 없다.
//    testAccess.test()
//    println(testAccess.name)
//    testAccess.name = "아무개 투"
//    println(testAccess.name)

    val reward: Reward = Reward()
    reward.rewardAmount = 2000 //마음대로 바꾸는 경우가 생긴다.
}

class Reward() {
    var rewardAmount: Int = 1000
}

class TestAccess {
    private var name: String = "홍길동" //private사용하면 name이라는 것에 접근할 수 없다./
//클래스 외부에서 접근할 수 없습니다.


    constructor(name: String) {
        this.name = name
    }
    fun changeName(newName:String){
        this.name =newName
    }


    //외부에서 사용하지못하는 함수를 왜만드냐???
    //
    // 자동차 클래스 안에 함수가 있음..
    //
    private fun test() {
        println("테스트")
    }
}

