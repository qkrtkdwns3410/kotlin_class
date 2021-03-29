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


    //2.
    val bank: Bank = Bank("박상준", "1995/11/03", 100000)
    println(bank.checkBalance())
    println(bank.withdraw(100000000))
    println(bank.deposit(100000))
    println()

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

//2)은행 계좌 만들기
class Bank(val name: String, val birth: String, var balance: Int) {
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

