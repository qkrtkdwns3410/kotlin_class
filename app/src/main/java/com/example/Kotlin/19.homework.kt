package com.example.Kotlin


fun main(array: Array<String>) {
    //1.
    val calculator1: Calculator1 = Calculator1()
    println(calculator1.plus(3, 2))
    println(calculator1.divide(5, 3))
    println()

    //1.2
    val calculator2: Calculator2 = Calculator2()
    println(calculator2.plus(3, 5, 2, 4, 1))
    println(calculator2.minus(3, 5, 2, 4, 1))
    println(calculator2.multiply(3, 5, 2, 4, 1))
    println(calculator2.divide(3, 5, 2, 4, 1))
    println()

    //1.3
    val calculator3: Calculator3 = Calculator3(3)
    println(calculator3.plus(3).minus(3))
    //-> 체이닝 (chaining)이 가능합니다.
    //--------------------------------/Calculator(6)
    //--------------------------------------------------/Cal(6).minus(3)


    //2.
    val bank: Bank = Bank("박상준", "1995/11/03", 100000)
    println(bank.checkBalance())
    println(bank.withdraw(100000000))
    println(bank.deposit(100000))
    println()

    val bank2: Bank = Bank("박상준", "1995/11/03", -10100)
    println(bank2.checkBalance())
    println("뱅크2")


    //2.3무조건 1000원을 가지고 시작하는 계좌입니다.
    val bank3 :Bank2 = Bank2("박상준","1995/11/03")
    println(bank3.checkBalance())
    println("뱅크3")

    //3.


}

//1)사칙 연산을 수행할 수 있는 클래스
class Calculator1() {
    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        return a - b
    }

    fun gop(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        return a / b
    }


}

//1.2)사칙연산 2단계
class Calculator2() {
    fun plus(vararg numbers: Int): Int {
        var result: Int = 0
        numbers.forEach {
            result += it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        for (i in 1 until numbers.size) {
            result -= numbers[i]
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {
            if (it != 0) {
                result *= it
            }
        }
        return result
    }

    fun divide(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        numbers.forEachIndexed { index, value ->
            if (index != 0 && value != 0) {
                result /= value
            }
        }
        return result

    }
}

//1.3)사칙연산 3단계
class Calculator3(val initialValue: Int) {
    fun plus(number: Int): Calculator3 {
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun minus(number: Int): Calculator3 {
        val result = this.initialValue - number
        return Calculator3(result)
    }

    fun multiply(number: Int): Calculator3 {
        val result = this.initialValue * number
        return Calculator3(result)
    }

    fun divide(number: Int): Calculator3 {
        val result = this.initialValue / number
        return Calculator3(result)
    }

}

//2)은행 계좌 만들기
class Bank {
    val name: String
    val birth: String
    var balance: Int

    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth
        if (balance >= 0) {
            this.balance = balance
        } else {
            this.balance = 0
        }

    }

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(Wmoney: Int): Int {
        if (balance >= Wmoney) {
            balance -= Wmoney
            return balance
        } else {
            println("잔액없자나")
            return balance

        }

    }

    fun deposit(Dmoney: Int): Int {
        return balance + Dmoney
    }
}

//2)1000원가지고 시작하는 계좌만들기
class Bank2(val name: String, val birth: String, var balance: Int =1000) {
    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(Wmoney: Int): Int {
        if (balance >= Wmoney) {
            balance -= Wmoney
            return balance
        } else {
            println("잔액없자나")
            return balance

        }

    }

    fun deposit(Dmoney: Int): Int {
        return balance + Dmoney
    }

}

//2.3))
class Bank3(initialBalance: Int){
    val balance:Int = if (initialBalance>=0) initialBalance else 0

    fun checkBalance():Int{
        return balance
    }
}

//3)Tv클래스
class TV(S사: String, M사: String, K사: String) {
    fun onOff(power: Boolean) {
        if (power == true) {
            println("tv가 켜졌습니다")

        } else {
            println("tv가 꺼졌습니다")
        }
    }

    fun change(ch: Int) {
        println("${ch}로 채널변경")
    }


}

