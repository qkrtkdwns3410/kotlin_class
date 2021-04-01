package com.example.Kotlin


//두번까지는 함수 중복 가능
//두번 이상이 넘어가면 리팩토링하라고 나옴

//25.상속
//부모로부터 설명서를 물려받는다.!

fun main(args: Array<String>) {
    val superCar100: SuperCar100 = SuperCar100()
    print(superCar100.drive())
//    superCar100.stop()

    val bus100: Bus100 = Bus100()
//    bus100.drive()


}

open class Car100() { //부모
    //class에는 기본적으로 private이 붙어있습닌다.
    open fun drive(): String {
        return "달린다"
    }

    fun stop() {

    }
}

//자식들.. open class를 상속받는다.
class SuperCar100() : Car100() {
    override fun drive(): String {
        val run = super.drive()
        return "빨리 $run"
    }
}
class Bus100() : Car100() {

}