package com.example.Kotlin

//과제
//Night, Monster (부모) ->Character클래스로 변경..
//SuperNight, SuperMonster (자식)
//24번 자료 참고해서 슈퍼나이트 , 슈퍼 몬스터를 만들고 상속관계를 이용해서 공격과 방어 기능을 물려받는다.
fun main(args: Array<String>) {
    val monster100 = SuperMonster(100, 10)
    val night100 = SuperNight(130, 8)
    monster100.attack(night100)
    monster100.bite(night100)

}
//상속이 만들어낸 특징
//- 자식 클래스는 부모 클래스의 타입이다.
//- 부모 클래스는 자식 클래스의 타입이 아니다.

open class Charactor(var hp: Int, val power: Int) {
    fun attack(charactor: Charactor, power: Int = this.power) {
        charactor.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("${javaClass.simpleName}의 남은 체력 $hp 입니다")
        else println("사망 했습니다")
    }
}

//자식 클래스가 인스턴스화 되기 위해서 부모 클래스가 선행되어서 인스턴스화 되어야 한다
class SuperMonster(hp: Int, power: Int) : Charactor(hp, power) {
    //부모클래스에서 선언된 변수는 자식클래스에서 val var적으면안됨.
    fun bite(charactor: Charactor) { //bite스킬
        super.attack(charactor, power + 2)
    }
}

class SuperNight(hp: Int, power: Int) : Charactor(hp, power) {
    val defensePower =2
    override fun defense(damage: Int) {
        super.defense(damage-defensePower) //2만큼 데미지 덜 닳음
    }
}
















